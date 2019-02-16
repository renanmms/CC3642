/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;
import java.util.Scanner;

/**
 *
 * @author unifrsilva
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0,j=0,array[] = new int[20];
        Scanner inp = new Scanner(System.in);
        System.out.print("Entre com 20 números: ");
        for(i=0;i<20;i++){
            
            array[i] =  inp.nextInt();
            if(array[i]<0){
                j = j + 1;
            }
        }
        System.out.printf("Você digitou %d números negativos.",j);            
        }
      // TODO code application logic here
}
    

