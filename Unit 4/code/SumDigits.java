// Programmer: Shaurya Srivastav 
// Date: 5/10/2021
// Purpose: To show while loops by individually adding 
//          each digit in a number

public class SumDigits {
    public static void main(String[] args){
        int number = 8008; 
        int sum = 0; 

        while(number > 0){
            int lastDigit = number % 10; 
            sum += lastDigit; 
            number = number /10; 
        }
        System.out.println("The Sum of the digits is: "+sum); 
    }
    
}
