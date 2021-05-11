// Programmer: Shaurya Srivastav 
// Date: 5/9/2021
// Purpose: to demonstrate if statements 

public class IfStatement{
    public static void main(String[] args){
        int iq = 100; 
        System.out.println("Sanjay's IQ is : -" + iq);
        
        if(iq >= 100){
            System.out.println("Nah bro ur wrong, sanjay's IQ isn't that high"); 
            iq+= 200; 
        }

        System.out.println("Sanjay's IQ is: -"+iq); 
    }

}