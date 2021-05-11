

public class Dog {

  private String name; 
  private String breed;
  private int age;

//create a constructor
  public Dog(String nm, String bd, int ag){
      name = nm; 
      breed = bd; 
      age = ag; 
  }

//create a behaviour for our object
  public void bark(){
      System.out.println("woof!");
  }

  public static void main(String[] args){
      Dog graceDog = new Dog("rex", "human-dog", 1);
      graceDog.bark();  
  }

}
