
package exercicio_tec_i;

import java.util.Arrays;


public class Questao_4 {
    
  
   
     public static void main(String[] args) {
         int cont = 0;
           //vetor com 50 posições para armazenar apenas números ímpares em ordem crescente
        
            int [] vetor50 = new int[50];
          
           for (int i = 0; i<100; i++){
               
               if(i %2 != 0 && i != 0){
             
                vetor50[cont] = i;
                cont++;
               
               }
               
           }
           
         
           System.out.println("Vetor com números ímpares: ");
           System.out.println(Arrays.toString(vetor50));
           
            
        
    }
}
