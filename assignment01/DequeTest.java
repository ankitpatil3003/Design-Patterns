package assignment01;

public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer> deque = new DequeImpl1<>();

        // Adding elements to the deque
        deque.addFirst(2);
        deque.addLast(10);
        deque.addLast(11);
        deque.addFirst(1);
        // System.out.println("deque print in reverse using toSting"+
        // deque.toString1());
        // Getting and removing elements
        System.out.println("Peek First: " + deque.peek()); // Should print "Peek First: 0"
        System.out.println("Poll First: " + deque.poll()); // Should print "Poll First: 0"
        System.out.println("Peek First after poll: " + deque.peek());
        System.out.println("Peek Last: " + deque.peekLast()); // Should print "Peek Last: 2"
        System.out.println("Poll Last: " + deque.pollLast()); // Should print "Poll Last: 2"

        // Checking the size
        System.out.println("Size: " + deque.size()); // Should print "Size: 1"

        // Adding more elements
        deque.addFirst(-1);

        // Iterating and printing elements
        while (deque.size() > 0) {
            System.out.println("Poll First: " + deque.poll());
        }
    }
}
