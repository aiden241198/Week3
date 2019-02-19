
package week3;
import java.util.Arrays;
import java.util.Random;

public class ArrayOfNumbers {

   private int[] numbers;
   
   
  public ArrayOfNumbers(int value1){
       
       this.numbers = new int[value1];
       
   }
   
   public ArrayOfNumbers(int[] array) {
       
        this.numbers = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            numbers[i] = array[i];
        }
     
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
   
   public int equal(int value1, int value2){
    
       int element1 = value1;
       int element2 = value2;
       
       for(int i=0; i < numbers.length; i++){
           if(numbers[element1] == numbers[element2] ){
           System.out.println("Equality found in array index "+element1+" and "+element2);
           break;
           
           } else{
                System.out.println("No Equal Value");
                break;
            }
       }
     return element1;
   }
   
   public void gcd(){
      
      Random random = new Random();
      
      int num1 = random.nextInt(numbers.length); 
      int num2;
       
       do {
            num2 = random.nextInt(numbers.length);
       } while (num1 == num2);
       
       int element1 = numbers[num1];
       int element2 = numbers[num2];
       
       System.out.print(element1+" "+element2+"\n");
       
       int gcd = element1%element2;
       
       System.out.println("Greatest Comon Divisor of "+element1+" and "+element2+" is: "+gcd);
       
   }
   
   public void sum(){
        
        int sum = 0;
        for( int i : numbers) {
            sum += i;
        }

        System.out.println("Sum of Array is :"+sum);
       
   }
   
   public void average(){

       int aLength = numbers.length;
       
       int sum = 0;
       for (int i=0;i<aLength;i++) {
           sum += numbers[i];
       }
       
       double average = sum / aLength;
       System.out.println("Average number contained in array is : "+average);
   }
   
   public int scalarMultiply(int multiplyer){
       
       
       
       for(int i=0; i < numbers.length; i++){
           numbers[i] = numbers[i] * multiplyer;
       }
       
       System.out.println(Arrays.toString(numbers));
       
    return multiplyer;
    }
   
    public int addConstant(int val){
       
      
       for(int i=0; i < numbers.length; i++){
           numbers[i] = numbers[i] + val;
       }
       
       System.out.println(Arrays.toString(numbers));
       
    return val;
    }
}
