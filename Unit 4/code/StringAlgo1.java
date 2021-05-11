// Progammer: Shaurya Srivastav 
// Date: 5/10/2021
// Purpose: to iterate through a string to find a substring

public class StringAlgo1 {
    public static void main(String[] args){
        String word = "sanjay Ramkumar"; 
        String sub = "Ram"; 
        boolean found = false; 

        for (int i = 0; i <= word.length()-sub.length(); i++){
            String portion = word.substring(i, i+sub.length()); 
            if (portion.equals(sub)){
                found = true;
            }
        }
        if (found){
            System.out.println("We found the smaller String"); 
        }else{
            System.out.println("We did not find the smaller string"); 
        }
    }
}