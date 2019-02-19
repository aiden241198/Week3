
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
public class ArrayOfNumbersApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int[] array = { 23, 32, 56, 44, 58, 61, 76, 80, 97, 31 };  
        
        //test array initialisation
        ArrayOfNumbers a = new ArrayOfNumbers(10);
        a.item(7);
        
        //test array index change
        ArrayOfNumbers b = new ArrayOfNumbers(10);
        b.setItem(7, 3);
       
        //test Max item in array
        ArrayOfNumbers c = new ArrayOfNumbers(10);
        c.max();
    }
    
}
