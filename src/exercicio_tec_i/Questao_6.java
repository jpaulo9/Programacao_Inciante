
package exercicio_tec_i;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Questao_6 {
    
    
    
     public static void main(String[] args) {
       // cria-se três vetores com 4 posições, adiciona valores em v1 e v2, soma v1+v2 e armazena o resultado da soma em vsoma
      int[] vetor1 = new int[4];
      int[] vetor2 = new int[4];
      int[] vetorSoma = new int[4];
    
      for(int i= 0; i<4;i++){
          vetor1[i] = new Random().nextInt(100);
          
      }
          System.out.println("Vetor 1:");
         System.out.println(Arrays.toString(vetor1));
      for(int i= 0; i<4;i++){
          vetor2[i] = new Random().nextInt(100);
          
      }
       System.out.println("Vetor 2:");
         System.out.println(Arrays.toString(vetor2));
     
         for(int i= 0; i<4;i++){
          vetorSoma[i] = vetor1[i]+vetor2[i];
          
      }
            
          System.out.println("Vetor com números somados:");
         System.out.println(Arrays.toString(vetorSoma));
         
     }
    
}
