/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author Aiden
 */
public class ArrayOfNumbers {

   private final int[][] numbers;
   
   public ArrayOfNumbers(int value1, int value2){
       this.numbers = new int[value1][value2];
       
       for(int i=0;i<numbers.length;i++)
        numbers[i][i] = 0;
   }
   
   public void setStorage(int[][] numbers) {
       int[][] storage = new int[numbers.length][numbers.length];
       
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = storage[i];
        }
   }

    
}
