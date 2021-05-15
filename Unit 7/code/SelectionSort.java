public class SelectionSort {
    public static void main(String[] args){
        for(int outerLoop = 0; outerLoop < myDucks.length; outerloop++){
            int minIndex = outerLoop; 
            for(int inner = outerLoop+1; inner <myDucks.length; inner++){
                if(myDucks[inner].compareTo(myDucks[minIndex])<0){
                    minIndex = inner; 
                }
            }
            if(minIndex != outerLoop{
                swapItems(minIndex, outerLoop, myDucks); 
            }
        }
        
    }
}
