/*
* Programmer: Shaurya Srivastav
* Date: 5/8/2021
* Purpose: demonstrate how non void methods work
*/
public class AverageNV{
    
    public double calcAverage(int num1, double num2){
        double average = (num1+num2)/2; 
        return average; 
    }

    public double calcAverage(int num1, int num2, double num3){
        double average = (num1+num2+num3)/3; 
        return average; 
    }

    public static void main(String[] args){
        AverageNV calculator = new AverageNV();

        System.out.println("The averge of 1 and 2.2 is: " + calculator.calcAverage(1, 2.2)); 
        
        
    }


}