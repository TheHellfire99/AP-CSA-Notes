public class SnackDriver {
    public static void main(String[] args){
        Snack choiceOne = new Snack("Cookies", 180);
        Snack choiceTwo = new Snack();
        System.out.println(choiceOne.getName()); 
        System.out.println(choiceTwo.getCalories()); 
        choiceTwo.setName("Chips"); 
        choiceTwo.calories = 150; //cannot call private instance variable
        System.out.println(choiceTwo.canEat()); //cannot call private method
    }
}
