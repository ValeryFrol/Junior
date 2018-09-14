package demoCollection;

public class CircularArrayQueue<E> implements Queue<E> {

    CircularArrayQueue(int capacity) {}

    @Override
    public void add(E element) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    private int head;
    private int tail;
    private E [] elements;
}
