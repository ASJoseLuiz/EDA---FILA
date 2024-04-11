package FILA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Fila<Integer> f = new Fila<>();
        Scanner sc = new Scanner(System.in);
        int ele = 0;
        int op = 0;
        do{
            System.out.println("1: Enfileirar um Elemento na Fila \n2: Desenfileirar um Elemento na Fila \n3: Mostrar o Primeiro Elemento da Fila \n4: Sair");
            op = sc.nextInt();
            try{
                if(op == 1){
                    System.out.println("Digite o elemento a ser enfileirado: ");
                    ele = sc.nextInt();
                    f.enqueue(ele);
                }
                else if(op == 2){
                    f.dequeue();
                    System.out.println("O primeiro elemento foi desenfileirado");
                }
                else if(op == 3){
                    System.out.println("O elemento do início da fila é " + f.head());
                }
                
            }catch (QueueOverFlowException | QueueUnderFlowException e){
                e.printStackTrace();
            }
        }while(op != 4);
        sc.close();
    }
}
