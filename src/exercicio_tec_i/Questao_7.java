
package exercicio_tec_i;

import java.util.Scanner;


public class Questao_7 {
    
     public static void main(String[] args) {
         
         //recebe números inteiros, soma o número atual com o digitado anteriormente até ultrapassar o valor 100
        int numero = 0;
          do{
           Scanner receber = new Scanner(System.in);
            System.out.println("Informe um número: ");
            int numeroAtual = receber.nextInt();
            numero += numeroAtual;
            
         
          }while(numero<100);
          System.out.println("A soma ultrapassou 100 = "+numero);
          
          
        
    }
}
