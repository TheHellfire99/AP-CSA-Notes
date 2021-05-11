/*
* Programmer: Shaurya Srivastav
* Date: 5/3/2021
* Purpose: demonstrate variables and data types
*/
public class StudentInfo {
    public static void main(String[] args){
        String name = "shaurya"; 
        double avgGrade; 
        avgGrade = 92.6; 

        final int NUMCLASS = 4; 
        boolean isEnrolled = true; 

        System.out.println(name + " has "+ NUMCLASS + " classes, "); 
        System.out.println("and average grade is "+ avgGrade); 
        System.out.println(name + " is currently "); 
        System.out.println("enrolled at school: " + isEnrolled); 
    } 
}
