//purpose : to find the minimum value in an array

public class MinMax{
    public static void main(String[] args){
        int [] array = {5, 4, 9, 10, 11 , 8, 2}; 
        int minNumber = array[0]; 
        int minIndex = 0; 

        for( int i = 0; i < array.length; i++){
            if(array[i]< minNumber){
                minNumber = array[i]; 
                minIndex = i; 
            }
        }
        System.out.println(minNumber);
        System.out.println(minIndex); 
    }
}