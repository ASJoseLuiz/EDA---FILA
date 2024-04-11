package FILA;

public class QueueUnderFlowException extends Exception {
    public QueueUnderFlowException(){
        super("Fila Vazia");
    }
}
