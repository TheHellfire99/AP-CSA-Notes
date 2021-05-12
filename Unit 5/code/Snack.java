// Programmer: Shaurya Srivastav 
// Date: 5/10/2021
// Purpose: show different parts of a class

public class Snack{
    private String name; //private instance variables
    private int calories; 

    public Snack(){ //default constructor 
        name = ""; 
        calories = 0; 
    }
    public Snack(String n, int c){//overloaded constructor
        name = n; 
        calories = c;
    }
    public String getName(){//accessor methods
        return name; 
    }
    public int getCalories(){
        return calories; 
    }
    public void setName(String n){//mutator methods
        name = n; 
    }
    public void setCalories(int c){
        calories = c; 
    }
    private boolean canEat(){
        return(calories < 150); 
    }
}