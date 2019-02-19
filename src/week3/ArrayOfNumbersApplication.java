
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Aiden
 */
public class ArrayOfNumbersApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  
        Scanner kboard = new Scanner(System.in);
        
        int choice = 0;
        int aLength = 0;
        int value = 0;
        int index = 0;
        
        System.out.println("Week 3 application");
        System.out.println("===============================");
        System.out.println("Enter length of Array");
        
        
        aLength = kboard.nextInt();
        
        System.out.println("Array Length Chosen "+aLength);
        System.out.println("Enter "+aLength+" Values");
        System.out.println("===============================");
        
        int[] Array = new int[aLength];
        
        for (int i = 0; i < aLength; i++) {
            System.out.println("Enter Value");
            Array[i] = kboard.nextInt();
        }
        
        System.out.println("ARRAY : "+Arrays.toString(Array));
       do {
            
            System.out.println("===============================");
            System.out.println("1 = Select Item in Array, 2 = Change Element in Array, 3 = Get Max, "
                            + "4 = Get Equal, 5 = Get Average, 6 = Get Sum, 7 = GCD, 8 = Add Value, "
                            + "9 = Multiply Array 0 = Exit");
        
            choice = kboard.nextInt();
            switch(choice)
            {
                
                case 1: 
                    System.out.println("Enter Index to check");
                    index = kboard.nextInt();
                    
                    ArrayOfNumbers item = new ArrayOfNumbers(Array);
                    item.item(index);
                    
                    break;
                    
                case 2: 
                    System.out.println("Enter index to change");
                    index = kboard.nextInt();
                    
                    System.out.println("Enter value to change to");
                    value = kboard.nextInt();
                    
                    
                    ArrayOfNumbers change = new ArrayOfNumbers(Array);
                    change.setItem(index,value);
                    
                    break;
                
                case 3: 
                  
                    ArrayOfNumbers maxval = new ArrayOfNumbers(Array);
                    maxval.max();
                    
                    break;
                    
                case 4: 
                    System.out.println("Enter element 1");
                    int element1 = kboard.nextInt();
                    
                    System.out.println("Enter element 2");
                    int element2 = kboard.nextInt();
                  
                    ArrayOfNumbers equalto = new ArrayOfNumbers(Array);
                    equalto.equal(element1, element2);
                    
                    break;
                    
                 case 5: 
                   
                    ArrayOfNumbers avg = new ArrayOfNumbers(Array);
                    avg.average();
                    
                    break;
                     
                case 6: 
                   
                    ArrayOfNumbers getsum = new ArrayOfNumbers(Array);
                    getsum.sum();
                    
                    break;
                    
                case 7: 
                   
                    ArrayOfNumbers getGCD = new ArrayOfNumbers(Array);
                    getGCD.gcd();
                    
                    break;
                
                case 8: 
                    System.out.println("Enter Number to Add to Array Elements");
                    value = kboard.nextInt();
                   
                    ArrayOfNumbers add = new ArrayOfNumbers(Array);
                    add.addConstant(value);
                    
                    break;
                
                case 9: 
                    System.out.println("Enter Number to Multiply Array Elements By");
                    value = kboard.nextInt();
                   
                    ArrayOfNumbers mult = new ArrayOfNumbers(Array);
                    mult.scalarMultiply(value);
                    
                    break;
            }
            
        } while(choice !=0);
        System.out.println("Goodbye");
        
        
        
        /*
        //test array initialisation
        ArrayOfNumbers a = new ArrayOfNumbers(10);
        a.item(7);
        
        //test array index change
        ArrayOfNumbers b = new ArrayOfNumbers(10);
        b.setItem(7, 3);
       
        //test Max item in array
        ArrayOfNumbers c = new ArrayOfNumbers(10);
        c.max();
        
        //test Equal values
        ArrayOfNumbers d = new ArrayOfNumbers(10);
        d.gcd();
        
        //test GCD from array elements
        ArrayOfNumbers e = new ArrayOfNumbers(10);
        e.gcd();
        
        //test sum of all numbers in array
        ArrayOfNumbers f = new ArrayOfNumbers(10);
        f.sum();
        
        //test average of all numbers in array
        ArrayOfNumbers g = new ArrayOfNumbers(10);
        g.average();
        
        //test array multiplyer
        ArrayOfNumbers h = new ArrayOfNumbers(10);
        h.scalarMultiply(2);
        
        //test array multiplyer
        ArrayOfNumbers h = new ArrayOfNumbers(10);
        h.addConstant(5);
        */
        
        
        
    }
    
}
