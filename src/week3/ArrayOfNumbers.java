
package week3;
import java.util.Arrays;
import java.util.Random;

public class ArrayOfNumbers {

   private int[] numbers;
   
   
  public ArrayOfNumbers(int value1){
       
       this.numbers = new int[value1];
      
   }
   
   public ArrayOfNumbers(int[] array) {
       
        int[] storage = new int[array.length];
       
        for (int i = 0; i < array.length; i++) {
            storage[i] = array[i];
        }
         int size = array.length;
        System.out.print("Array Information Copied to Storage\n");
        System.out.println(Arrays.toString(storage));
        System.out.print("Array Size :"+size);
       
        
   }
   
   public int item(int value1){
       int index = value1;
      
       System.out.println("Current Array "+Arrays.toString(numbers));
       System.out.println("Contents of Index: "+index+" is "+numbers[index]);
      
       return index;
   }
   
   public int setItem(int value1, int value2){
       
       int aIndex = value1;
       int newVal = value2;
       
       
       numbers[aIndex] = newVal;
       System.out.println("Array Element Changed");
       System.out.println("Current Array "+Arrays.toString(numbers));
       
       
       return newVal;
   }
   
   public void max(){
        
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++)
        {
         if (numbers[i] > max)
         {
          max = numbers[i];
          
         }
         
        } 
        System.out.println("The largest item stored in array is :"+max);
   }
   
   public void equal(){
       
       int[] equalArray = { 23, 32, 56, 44, 58, 61, 76, 80, 97, 31 };
       int value = 23   ;
       
       for(int i=0; i < equalArray.length; i++){
           if(equalArray[i] == value){
           System.out.println("Value "+value+" found in array index");
           return;
           
           } else{
                System.out.println("No Equal Value");
                return;
            }
       }
     
   }
   
   public void gcd(){
      
      Random random = new Random();
      int[] equalArray = { 23, 32, 56, 44, 58, 61, 76, 80, 97, 31 };
        
      int num1 = random.nextInt(equalArray.length); 
      int num2;
       
       do {
            num2 = random.nextInt(equalArray.length);
       } while (num1 == num2);
       
       int element1 = equalArray[num1];
       int element2 = equalArray[num2];
       
       System.out.print(element1+" "+element2+"\n");
       
       int gcd = element1%element2;
       
       System.out.println("Greatest Comon Divisor is: "+gcd);
       
   }
   
   public void sum(){
        
        int sum = 0;
        for( int i : numbers) {
            sum += i;
        }

        System.out.println(sum);
       
   }
   
   public void average(){
       int[] Array = { 23, 32, 56, 44, 58, 61, 76, 80, 97, 31 };
       int aLength = Array.length;
       
       int sum = 0;
       for (int i=0;i<aLength;i++) {
           sum += Array[i];
       }
       
       double average = sum / aLength;
       System.out.println("Average number contained in array is : "+average);
   }
   
   public int scalarMultiply(int multiplyer){
       
       int[] Array = { 23, 32, 56, 44, 58, 61, 76, 80, 97, 31 };
       
       for(int i=0; i < Array.length; i++){
           Array[i] = Array[i] * multiplyer;
       }
       
       System.out.println(Arrays.toString(Array));
       
    return multiplyer;
    }
   
    public int addConstant(int val){
       
       int[] Array = { 23, 32, 56, 44, 58, 61, 76, 80, 97, 31 };
       
       for(int i=0; i < Array.length; i++){
           Array[i] = Array[i] + val;
       }
       
       System.out.println(Arrays.toString(Array));
       
    return val;
    }
}
