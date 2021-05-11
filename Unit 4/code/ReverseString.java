// Programmer: Shaurya Srivastav 
// Date: 5/20/2021
// Purpose: to reverse a string 

public class ReverseString {
    public static void main(String[] args){
        String original = "supercalifragilisticexpialidocius"; 
        String reversed = ""; 

        for (int i = 0; i < original.length(); i++){
            String single = original.substring(i, i+1); 
            reversed = single + reversed;
        }
        System.out.println("Reversed String: "+reversed); 
    }    
}
