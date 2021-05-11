public class Wrapper {
   public static void main(String[] args){
       Integer num1 = new Integer(157); 

       System.out.println(num1); 

       System.out.println(Integer.MAX_VALUE); 
       System.out.println(Integer.MIN_VALUE);
       
       System.out.println(Integer.MAX_VALUE + 1);  

       int num1int = num1.intValue(); 
       System.out.println(num1int);
       
       Double score1  = new Double (69.420); 
       System.out.println(score1); 

       double score2 = score1.doubleValue(); 
       System.out.println(score2); 

   } 
}
