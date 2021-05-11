/*
* Programmer: Shaurya Srivastav 
* Date: 5/3/2021
* Purpose: Demonstrate syntax and logic errors
*/

public class FindTheBugs {
    public static void main(String[] Args){
       //Sustyem.out.print("dog ningen is great");  //example of syntax error as system is misspelled
        System.out.println("Add: 5 and 2: "+ (5-2)); //example of logic error as i want to add 5 and 2 but i subtract 5 and 2
        System.out.println(5/0); //example of exception as its not possible to divide by 0
    
    }
}
