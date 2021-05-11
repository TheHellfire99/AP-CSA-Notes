/*
* Programmer: Shaurya Srivastav 
* Date: 5/4/2021
* Purpose: Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
*          Assign the value of roll_no as '2' and that of name as "John" by creating an object of the
* .        class Student.
*/




public class Student {

    private String name; 
    private int roll_no; 

    public Student(String nm, int roll){
        name = nm; 
        roll_no = roll; 
    }

    public static void main(String[] args){
        Student student1 = new Student("nijga", 2); 
        System.out.println(student1.name + student1.roll_no); 
    }

    
}
