/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;
import java.util.Arrays;
/**
 *
 * @author Aiden
 */
public class ArrayOfNumbers {

   protected int[][] numbers;
   
   
   public ArrayOfNumbers(int value1, int value2){
       
       this.numbers = new int[value1][value2];
       
   }
   
   public ArrayOfNumbers(int[][] array) {
       
        System.out.println(Arrays.deepToString(array));
       
        int[][] storage = new int[array.length][array.length];
       
        for (int i = 0; i < array.length; i++) {
            storage[i] = array[i];
        }
         int size = array.length;
        System.out.print("Array Information Copied to Storage\n");
        System.out.println(Arrays.deepToString(storage));
        System.out.print(size);
       
        
   }
   
   
   

    
}
