package assignment01;

public interface Deque<E> {
	/**
	 * Inserts the specified element after the final element of this deque.
	 * 
	 * @param e the element to add
	 */
	void addLast(E e); // addEnd

	/**
	 * Inserts the specified element at the head of this deque.
	 * 
	 * @param e the element to add
	 */
	void addFirst(E e); // addStart

	/**
	 * Retrieves, but does not remove, the head of the deque (the first element of
	 * this deque)
	 * or returns null if this deque is empty.
	 * 
	 * @return the head of the deque or null if this deque is empty
	 */
	E peek();

	/**
	 * Retrieves and removes, the head of the deque (the first element of this
	 * deque)
	 * or returns null if this deque is empty.
	 * 
	 * @return the head of the deque or null if this deque is empty
	 */
	E poll();

	/**
	 * Retrieves, but does not remove, the final element of the deque (the last
	 * element of this deque)
	 * or returns null if this deque is empty.
	 * 
	 * @return the final element of the deque or null if this deque is empty
	 */
	E peekLast();

	/**
	 * Retrieves and removes, the head of the deque (the first element of this
	 * deque)
	 * or returns null if this deque is empty.
	 * 
	 * @return the head of the deque or null if this deque is empty
	 */
	E pollLast(); // pullLast

	/**
	 * Returns the number of elements in this deque.
	 * 
	 * @return the number of elements in this deque
	 */
	int size();
}
