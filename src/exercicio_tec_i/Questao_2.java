
package exercicio_tec_i;

import java.util.Scanner;


public class Questao_2 {
    
     public static void main(String[] args) {
       // retira média de 3 valores 
       int a, b, c;
       Scanner receber = new Scanner(System.in);
         System.out.println("Informe o valor de A: ");
         a = receber.nextInt();
         System.out.println("Informe o valor de B: ");
         b = receber.nextInt();
         System.out.println("Informe o valor de C: ");
         c = receber.nextInt();    
       double media = (a+b+c)/3;
       
       
        System.out.println("A média das variáveis A,B e C é = "+ media);
        
        if(media>10){
         System.out.println("A média é maior que 10");
        }
        
        
    }
}
