package assignment03;

//import assignment03.FileCompositeIterator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

import javax.swing.JFileChooser;

public class OpenDirectory1 {
    private static final String[] READABLE_EXTENSIONS = {
            ".txt", ".text", ".java", ".c", ".cpp", ".h", ".htm", ".html", ".js", ".hs", ".xml", ".log"
    };

    public static void listFiles(File file, String searchText) {
        try (PrintWriter pw = new PrintWriter("Output4.txt")) {
            System.out.println(file);
            FileCompositeIterator fc = new FileCompositeIterator();
            var iter = fc(file);
            while (iter.hasNext()) {
                File f = iter.next();
                if (f.getName().contains(searchText) || containsText(f, searchText)) {
                    pw.println(f.getAbsolutePath());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean containsText(File file, String searchText) {
        if (!isReadable(file))
            return false;

        try (Stream<String> lines = Files.lines(Paths.get(file.getAbsolutePath()))) {
            return lines.anyMatch(line -> line.contains(searchText));
        } catch (Exception e) {
            System.err.println("PROBLEM WITH " + file);
            e.printStackTrace();
        }
        return false;
    }

    private static boolean isReadable(File file) {
        String name = file.getName().toLowerCase();
        for (String ext : READABLE_EXTENSIONS) {
            if (name.endsWith(ext)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the search text:");
        String searchText = scanner.nextLine();
        scanner.close();

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                var chooser = new JFileChooser();
                chooser.setCurrentDirectory(new java.io.File("~"));
                chooser.setDialogTitle("Pick a starting directory");
                chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                chooser.setAcceptAllFileFilterUsed(false);
                if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
                    System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
                    listFiles(chooser.getSelectedFile(), searchText);
                } else {
                    System.out.println("No Selection ");
                }
                System.out.println("DONE!");
            }
        });
    }
}
