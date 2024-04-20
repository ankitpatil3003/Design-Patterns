package assignment01;

public class DequeImpl1<E> implements Deque<E> {

    private DLlist<E> adapt_List;

    public DequeImpl1() {
        this.adapt_List = new DLlist<>();
    }

    @Override
    public void addFirst(E e) {
        adapt_List.insertList(e, 0);
    }

    @Override
    public void addLast(E e) {
        adapt_List.insertList(e, adapt_List.length());
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return adapt_List.get(0);
    }

    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        E element = adapt_List.get(0);
        adapt_List.delete(0);
        return element;
    }

    @Override
    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return adapt_List.get(adapt_List.length() - 1);
    }

    @Override
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        E element = adapt_List.get(adapt_List.length() - 1);
        adapt_List.delete(adapt_List.length() - 1);
        return element;
    }

    @Override
    public int size() {
        return adapt_List.length();
    }

    private boolean isEmpty() {
        return adapt_List.length() == 0;
    }
}
