/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;
import java.util.Scanner;
/**
 *
 * @author unifrsilva
 */

public class Ex1 {
    /**
     * @param args the command line arguments
     */
    
    //Exercicio 1
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int[] myArray;
        int number1,number2,number3,p;
        System.out.print("Entre com os valores: ");
        number1 = entrada.nextInt();
        number2 = entrada.nextInt();
        number3 = entrada.nextInt();
        //myList[0] = number1;
        //myList[1] = number2;
        //myList[2] = number3;
        p = number1 * number2 * number3;
        System.out.printf("O valor eh : %d\n",p);     
        /*if(number1 >= number2 && number2 <= number3){
            System.out.printf("%d %d %d",number1,number2,number3);
        }   
        else if(number1 <= number2 && number3 >= number1){
            System.out.printf("%d %d %d",number2,number3,number1);
        }
        else{
            System.out.printf("%d %d %d",number1,number2,number3);
        }*/
        // TODO code application logic here
    }
    
}
