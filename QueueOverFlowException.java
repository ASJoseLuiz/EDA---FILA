package FILA;

public class QueueOverFlowException extends Exception{
    public QueueOverFlowException(){
        super("Fila Cheia");
    }
}
