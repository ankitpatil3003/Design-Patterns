package assignment03;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class FileCompositeIterator implements Iterator<File> {
	private Stack<Iterator<File>> stack = new Stack<Iterator<File>>();

	public FileCompositeIterator(File file) {
		if (file.isDirectory()) 
			stack.push(Arrays.asList(file.listFiles()).iterator());
		else
			stack.push(NullIterator.getNullIterator());
	}

	public File next() {
		if (hasNext()) {
			Iterator<File> iterator = stack.peek();
			File file = iterator.next();
			if (file.isDirectory()) {
				if(file.listFiles() != null) {
					List<File> contents = Arrays.asList(file.listFiles());
					if (contents.size() > 0) {
						stack.push(contents.iterator());
					}
				}
			}
			return file;
		} else {
			return null;
		}
	}

	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator<File> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
}
