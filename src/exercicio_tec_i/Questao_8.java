
package exercicio_tec_i;

import java.util.Scanner;


public class Questao_8 {
    public static void main(String[] args) {
       
            int[] num = new int[3];
            
            // ordenar de forma crescente 3 números aleatórios
            Scanner receber = new Scanner(System.in);
            System.out.println("Informe um número: ");
            int numeroA = receber.nextInt();
             
            System.out.println("Informe um número: ");
            int numeroB = receber.nextInt();
             
            System.out.println("Informe um número: ");
            int numeroC = receber.nextInt();
            
            if(numeroA>numeroB){
                
                if(numeroB>numeroC){
                    System.out.println("A ="+numeroA+" B = "+numeroB+" C = "+numeroC);
                }
            
            }
            if(numeroB>numeroA){
                
                if(numeroA>numeroC){
                    System.out.println("B ="+numeroB+" A = "+numeroA+" C = "+numeroC);
                }
            
            }
            if(numeroC>numeroA){
                
                if(numeroC>numeroB){
                    System.out.println("C ="+numeroC+" A = "+numeroA+" B = "+numeroB);
                }
            
            }
             if(numeroC>numeroB){
                
                if(numeroB>numeroA){
                    System.out.println("C ="+numeroC+" B= "+numeroB+" A = "+numeroA);
                }
            
            }
            
        
           
            
         
          
          
        
    }
}
