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

   private int[] numbers;
   
   
  public ArrayOfNumbers(int value1){
       
       this.numbers = new int[value1];
      
       System.out.print(value1);
   }
   
   public ArrayOfNumbers(int[] array) {
       
        int[] storage = new int[array.length];
       
        for (int i = 0; i < array.length; i++) {
            storage[i] = array[i];
        }
         int size = array.length;
        System.out.print("Array Information Copied to Storage\n");
        System.out.println(Arrays.toString(storage));
        System.out.print(size);
       
        
   }
   
   public int item(int value1){
       int index = value1;
       
       System.out.println(Arrays.toString(numbers));
       
       
       return index;
   }
   
   
   
   

    
}
