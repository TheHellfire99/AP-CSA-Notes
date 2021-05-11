/*
* Programmer: Shaurya Srivastav
* Date: 5/4/2021
* Purpose: to demonstrate what void methods are
*/



public class Letter {
    //void method contains calling statements for
    //other contstructors
    public void writeLetter(){
        greeting(); 
        specialMessage(); 
        specialMessage(); 
        closing(); 
    }

    public void greeting(){
        System.out.println("sup njgga"); 
    }

    public void specialMessage(){
        System.out.println("I hate lolis"); 
    }

    public void closing(){
        System.out.println("SIKE U THOUGHT"); 
    }

    public static void main(String[] args){
        Letter friendLetter = new Letter();
        friendLetter.writeLetter(); 
    }
}
