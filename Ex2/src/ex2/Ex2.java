/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;
/**
 *
 * @author unifrsilva
 */
import java.util.Scanner;

public class Ex2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int _array[];
        int[] array = new int[3];
        int temp;
        Scanner ent = new Scanner(System.in);
        int i;
        int j;
        for(i=0;i<3;i++){
            System.out.printf("Digite o valor de array[%d]: ",i);
            array[i] = ent.nextInt();
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(array[i] >= array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        for(i=0;i<3;i++){
            System.out.printf("array[%d]: %d\n",i,array[i]);
        }
        
            // TODO code application logic here
    }
    
}
