public class Traverse {
    public static void main(String[] args){
        String[][] grid = new String[4][5]; 
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col <grid[0].length; col++){
                System.out.println(grid[row][col]);
            }
            System.out.println(); 
        }
    }
    
}
