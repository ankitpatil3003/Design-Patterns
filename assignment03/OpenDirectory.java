package assignment03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

import javax.swing.JFileChooser;

public class OpenDirectory {
	public static void listFiles(File file) {
		try (PrintWriter pw = new PrintWriter("Output3.txt")) {
			System.out.println(file);
			var iter = new FileCompositeIterator(file);
			while(iter.hasNext()) {
				File f = iter.next();
				pw.println(f);
				if(f.getName().toUpperCase().contains(".TXT")
						|| f.getName().toUpperCase().contains(".HTM")) {
					if(count(f, pw) > 0)
						System.out.println(f + " " + count(f, pw));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(
				new Runnable() {
					public void run() {
						// See https://stackoverflow.com/questions/10083447/selecting-folder-destination-in-java
						var chooser = new JFileChooser(); 
						chooser.setCurrentDirectory(new java.io.File("~"));
						chooser.setDialogTitle("Pick a starting directory");
						chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
						// disable the "All files" option.
						chooser.setAcceptAllFileFilterUsed(false);
						if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) { 
							System.out.println("getCurrentDirectory(): " 
									+  chooser.getCurrentDirectory());
							System.out.println("getSelectedFile() : " 
									+  chooser.getSelectedFile());
							listFiles(chooser.getSelectedFile());
						} else {
							System.out.println("No Selection ");
						}
						System.out.println("DONE!");
					}
				});		
	}

	public static long count(File f, PrintWriter pw) {
		long ct = 0;
		try {
			if(f.getName().toUpperCase().contains(".TXT")) {
				BufferedReader reader = new BufferedReader(new FileReader(f));
				String line;
				while((line = reader.readLine()) != null) {
					String[] temp = line.split("\\s+");
					for(String s : temp)
						if(s.toLowerCase().contains("the")) ct++;
				}
				reader.close();
			} else {
				BufferedReader reader = new BufferedReader(new FileReader(f));
				String line;
				while((line = reader.readLine()) != null) {
					String[] temp = line.split("\\s+");
					for(String s : temp)
						if(s.toLowerCase().contains("href=")) ct++;
				}
				reader.close();
			}
		} catch (Exception e) {
			pw.println("PROBLEM WITH " + f);
			e.printStackTrace(pw);
		}			
		return ct;
	}
}
