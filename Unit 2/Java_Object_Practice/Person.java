/*
* Programmer: Shaurya Srivastav 
* Date: 5/4/2020
* Purpose: Deine a person object and create a class
*/

public class Person{

    private String name; //initialize attributes
    private int age;//initialize attribute
    private boolean isAdult; //initialize attribute

    Public Person(String nm, int ag, boolean ad){ //make a constructor using the attributes
        name = nm; 
        age = ag; 
        isAdult = ad; 
    }

    public void increaseAge(){//create behaviours
        age++; 
    }

    public static void main(String[] args){
    }

    
}