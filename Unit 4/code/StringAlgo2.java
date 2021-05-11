// Programmer: Shaurya Srivastav 
// Date: 5/10/2021
// Purpose: count the number of times a substring is found in a string

public class StringAlgo2{
    public static void main(String[] args){
        String word = "Supercalifragilisticexpialidocious"; 
        int count = 0; 

        for(int i = 0; i < word.length(); i++){
            String letter = word.substring(i, i+1); 
            if(letter.equals("a")||letter.equals("e")||letter.equals("i")||
            letter.equals("o")||letter.equals("u")){
                count++; 
            }
        }
        System.out.println("the total number of vowels in the word is: "+count); 

    }

}