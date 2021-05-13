//purpose : shift all array values to the right

public class ShiftArray {
    public static void main(String[] args){
        int [] numbers = {1,2,3,4,5}; 
        int [] shifted = new int [numbers.length]; 
        int shift = 8; 
        for(int i = 0; i < numbers.length; i++){
            shifted[Math.abs((i+shift) % numbers.length)]=numbers[i]; 
        }
        numbers = shifted; 
        for(int num : numbers){
            System.out.println(num + ""); 
        }
    }
    
}
