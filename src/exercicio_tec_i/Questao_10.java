
package exercicio_tec_i;

import java.util.Arrays;
import java.util.Scanner;


public class Questao_10 {
    
     public static void main(String[] args) {
            // usamos um método para receber um número e apontar quantos números pares existem antes dele
           Scanner receber = new Scanner(System.in);
           System.out.println("Informe um número inteiro: ");
           int numeroAtual = receber.nextInt();
           
           Num(numeroAtual);
       
    }
     
    public static void Num(int num){
        int [] vetor = new int[num];
        int contPar =0;
        for(int i = 0; i<vetor.length; i++){
            
            vetor[i] = num--;
            if (vetor[i]% 2 == 0){
                contPar++;
            }
        }
        int [] vetorPar = new int[contPar];
        contPar = 0;
        for(int i = 0; i<vetor.length; i++){
            
            if (vetor[i]% 2 == 0){
                 
                vetorPar[contPar] = vetor[i];
                contPar++;
            }
            
        }
        
        System.out.println("Números!");
        System.out.println(Arrays.toString(vetor));
        System.out.println("Números Pares!");
        System.out.println(Arrays.toString(vetorPar));
        
    
    }
}
