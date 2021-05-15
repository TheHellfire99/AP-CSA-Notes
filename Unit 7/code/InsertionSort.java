public class InsertionSort {
    public static void main(String[] args){
        for(int j = 1; j < randomList.size(); j++){
            DebugDuck tested = randomList.get(j);
            int i = j-1; 
            
            while(i >=0&& tested.CompareTo(randomList.get(i))<0){
                randomList.set(i+1, randomList.get(i)); 
                inner--; 
            }
            randomList.set(inner+1, tested); 
        }
    }
    
}
