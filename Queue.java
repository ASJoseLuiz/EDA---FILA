package FILA;

public interface Queue<T> {
    public void enqueue(T elem) throws QueueOverFlowException;
    public T dequeue() throws QueueUnderFlowException;
    public T head();
    public boolean isEmpty();
    public boolean isFull();
}
