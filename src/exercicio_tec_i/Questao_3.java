
package exercicio_tec_i;
import java.util.Arrays;


public class Questao_3 {
      public static void main(String[] args) {
          // vetor de 100 posições preenchido com valores de 0 a 99 em ordem decrescente
          int[] numeros  = new int[100];
          int valores = 99;
          for (int i = 0; i <100;i++){
    
                  numeros[i] = valores--;
              
              
          }
       
        System.out.println(Arrays.toString(numeros));
        
        
    }
}
