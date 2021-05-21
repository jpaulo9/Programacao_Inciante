
package exercicio_tec_i;

import java.util.Scanner;



public class Questao_5 {
    public static void main(String[] args) {
       
        // recebe dois valores, oferece duas operações, a soma e a subtração,
        //dependendo da opção o programa deve executar uma destas
      Scanner opcao = new Scanner(System.in);
      
        System.out.println("Digite um número inteiro: ");
        int a = opcao.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int b = opcao.nextInt();
        
        System.out.println("Digite a operação que deseja realizar: 'somar' ou 'subtrair'?");
        String palavra = opcao.next();
        
        if(palavra.equals("somar")){
        
            int res = a+b;
            System.out.println(" O resultado da soma dos números é: "+res);
        }else if (palavra.equals("subtrair")){
        
            int res = a-b;
            System.out.println(" O resultado da subtração dos números é: "+res);
        }else{
        
            System.out.println("Opção não encontrada");
        
        }
        
        
        
    }
}
