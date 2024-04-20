package assignment01;

public class DequeImpl2<E> extends DLlist<E> implements Deque<E> {

    @Override
    public void addFirst(E e) {
        insertList(e, 0);
    }

    @Override
    public void addLast(E e) {
        insertList(e, length());
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        E element = get(0);
        delete(0);
        return element;
    }

    @Override
    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return get(length() - 1);
    }

    @Override
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        E element = get(length() - 1);
        delete(length() - 1);
        return element;
    }

    @Override
    public int size() {
        return length();
    }

    private boolean isEmpty() {
        return length() == 0;
    }
}
