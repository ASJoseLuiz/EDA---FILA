package FILA;

public class Fila<T> implements Queue<T>{

    private final int MAX = 10;
    private Object[] array;
    private int head;
    private int tail;

    public Fila(){
        this.array = new Object[MAX];
        this.tail = 0;
        this.head = 0;
    }

    @Override
    public void enqueue(T elem) throws QueueOverFlowException{
        if(isFull()){
            throw new QueueOverFlowException();
        }
        else{
            array[tail] = elem;
            tail = (tail + 1) % MAX; 
        }
    }

    @Override
    public T dequeue() throws QueueUnderFlowException{
        if(isEmpty()){
            throw new QueueUnderFlowException();
        }
        @SuppressWarnings("unchecked")
        T elem = (T) array[head];
        head = (head + 1) % MAX;
        return elem;
    }

    @Override
    public T head(){
        if(isEmpty()){
            return null;
        }
        else{
            @SuppressWarnings("unchecked")
            T elem = (T) array[head];
            return elem;
        }
    }

    @Override
    public boolean isEmpty(){
        if(head == tail) return true;
        return false;
    }

    @Override
    public boolean isFull(){
        if ((tail + 1) % MAX == head) return true;
        return false; 
    }
}
