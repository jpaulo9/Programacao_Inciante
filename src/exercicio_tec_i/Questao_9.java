
package exercicio_tec_i;

import java.util.Scanner;


public class Questao_9 {
     
    public static void main(String[] args) {
        
        // criar um método para receber como parâmetros um dado string e outro númerico/ retornar uma frase com esses dados 
           Scanner receber = new Scanner(System.in);
            System.out.println("Informe sua idade : ");
          
            int idade = receber.nextInt();
          
              System.out.println("Informe sua idade : ");
          
            String nome = receber.next();
   
         Dados(nome, idade);
            
        
    }
    
    
    public static void Dados(String nome, int idade){
     
         System.out.println("Olá, "+nome+" sua idade é "+idade+" anos.");
        
     }
     
    
        
}
