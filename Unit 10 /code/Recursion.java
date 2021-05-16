public class Recursion{
    public static void simpleRecur(int n){
        System.out.println(n); 
        if(n>2){
            simpleRecur(n-1); 
        }
        System.out.println(n);    
    }
}