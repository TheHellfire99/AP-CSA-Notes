/*
* Progammer: Shaurya Srivastav
* Date: 5/8/2021
* Purpose: to create and show string literals and objects and show 
*          how concatenation works
 */


public class StringConcat {
    public static void main(String[] args){
        String name1 = "johhny gulliver"; 
        String name2 = new String("Julia Hair"); 
        
        int JgAge = 16; 
        int JhAge = 10; 

        String johnny = name1 + " " + JgAge; 
        name2 += JhAge; 

        System.out.println(johnny); 
        System.out.println(name2); 
    }
}

