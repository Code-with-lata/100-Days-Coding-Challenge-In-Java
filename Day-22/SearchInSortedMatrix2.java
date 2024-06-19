public class SearchInSortedMatrix2 {
    public static boolean topStairCaseSearch(int matrix[][], int key){
         int row = matrix.length-1,col= 0;

         while (row >= 0 && col < matrix.length) {
            if(matrix[row][col] == key){
                System.out.println("found key at (" + row + "," + col + ")");
                return true;

            }
            if
         }
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {29,29,37,48},
                          {32,33,39,50}};
        
        int key = 30;
    }    
    
}
