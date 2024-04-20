package assignment03;
import java.io.File;
import java.util.Iterator;
  
public class NullIterator implements Iterator<File> {
	private static NullIterator singleton = new NullIterator();
	private NullIterator() {}
	public static Iterator<File> getNullIterator() {
		return singleton;
	}
	public File next() {
		return null;
	}
	public boolean hasNext() {
		return false;
	}
}
