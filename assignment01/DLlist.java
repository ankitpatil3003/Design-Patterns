package assignment01;

public class DLlist<E> {
	static class Node<E> {
		E data;
		Node<E> next;
		Node<E> previous;

		Node(E e) {
			data = e;
		}
	}

	Node<E> head;

	/**
	 * Inserts the specified element at the specified index position in this
	 * doubly-linked list.
	 * If the index is list.length(), then the insertion is at the end of the
	 * doubly-linked list.
	 * 
	 * @param e     element to be inserted
	 * @param index index at which the specified element is to be inserted
	 * @throws IndexOutOfBoundsException - if the index is out of range (index < 0
	 *                                   || index > length())
	 */
	public void insertList(E e, int index) {
		if (index < 0 || index > length())
			throw new IndexOutOfBoundsException("for index " + index);
		Node<E> newNode = new Node<E>(e);
		if (head == null) {
			head = newNode;
			return;
		}
		if (index == 0) {
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
		} else {
			Node<E> temp = head;
			while (index > 1) {
				temp = temp.next;
				index--;
			}
			newNode.next = temp.next;
			newNode.previous = temp;
			temp.next = newNode;
		}
	}

	/**
	 * Returns the number of elements in this doubly-linked list.
	 * 
	 * @return the number of elements in this doubly-linked list
	 */
	public int length() {
		Node<E> temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	// Package private method that may be used when testing
	Node<E> last() {
		Node<E> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp;
	}

	@Override
	public String toString() {
		if (head == null)
			return "NULL";
		StringBuilder str = new StringBuilder();
		Node<E> temp = head;
		while (temp != null) {
			str.append(temp.data + "->");
			temp = temp.next;
		}
		str.setLength(str.length() - 2);
		return str.toString();
	}

	// prints the list in reverse order, may be used for testing
	String toString1() {
		if (head == null)
			return "NULL";
		StringBuilder str = new StringBuilder();
		Node<E> temp = last();
		while (temp != null) {
			str.append(temp.data + "<-");
			temp = temp.previous;
		}
		str.setLength(str.length() - 2);
		return str.toString();
	}

	/**
	 * Returns the element at the specified position in this doubly-linked list.
	 * 
	 * @param index index of the element to return
	 * @return the element at the specified position in this doubly-linked list
	 * @throws IndexOutOfBoundsException - if the index is out of range (index < 0
	 *                                   || index >= length())
	 */
	public E get(int index) {
		if (index < 0 || index >= length())
			throw new IndexOutOfBoundsException("Out of bounds for index " + index);
		Node<E> temp = head;
		int count = 0;
		while (count < index && temp != null) {
			count++;
			temp = temp.next;
		}
		return temp.data;

	}

	/**
	 * Deletes the element at the specified index position in this doubly-linked
	 * list.
	 * Does nothing if the element is not present in the doubly-linked list.
	 * 
	 * @param index the index of the element to be removed
	 * @throws IndexOutOfBoundsException - if the index is out of range (index < 0
	 *                                   || index >= length())
	 */
	public void delete(int index) {
		if (index < 0 || index >= length())
			throw new IndexOutOfBoundsException("Deletion impossible for index " + index);
		Node<E> temp = head;
		if (index == 0) {
			head = temp.next;
			if (head != null)
				head.previous = null;
			temp.next = null;
			temp.previous = null;
			return;
		}
		int count = 0;
		while (count < index && temp != null) {
			count++;
			temp = temp.next;
		}
		temp.previous.next = temp.next;
		if (temp.next != null)
			temp.next.previous = temp.previous;
		temp.next = null;
		temp.previous = null;
	}

	/**
	 * Deletes the first occurrence of the specified element from this doubly-linked
	 * list, if it is present.
	 * Returns false if the doubly-linked list is empty.
	 * 
	 * @param e element to be deleted from this doubly-linked list if present
	 * @return true if this doubly-linked list contained the specified element,
	 *         otherwise false
	 */
	public boolean delete(E e) {
		if (length() == 0)
			return false;
		Node<E> temp = head;
		if (head.data.equals(e)) {
			head = temp.next;
			if (head != null)
				head.previous = null;
			temp.next = null;
			temp.previous = null;
			return true;
		}
		while (temp != null && !temp.data.equals(e)) {
			temp = temp.next;
		}
		if (temp == null)
			return false;
		if (temp.previous != null)
			temp.previous.next = temp.next;
		if (temp.next != null)
			temp.next.previous = temp.previous;
		temp.next = null;
		temp.previous = null;
		return true;
	}
}
