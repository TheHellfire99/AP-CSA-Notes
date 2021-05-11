/*
* Programmer: Shaurya Srivastav 
* Date: 5/8/2021
* Purpose: Create a lunch divider program to show non void methods
 */
public class LunchCalculator {
   
    public double divideBill(double total, int peeps){
        double payment = total/peeps; 
        return payment; 
    }
    public static void main(String[] args){

        LunchCalculator divider = new LunchCalculator(); 

        System.out.print("each of the 6 people who ate for 80 dollars needs to pay: $"); 
        System.out.println(divider.divideBill(80, 6)); 

    }
}
