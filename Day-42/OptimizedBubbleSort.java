public class OptimizedBubbleSort {
    public static void OptimizedBubbleSort(int arr[] ){
        
        for(int i=0;i<arr.length-1;i++){
            Boolean swapped = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] >arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
               
            }
            if(swapped == false){
                break;
            }
            
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {5,2,6,9,4,7,1};
        OptimizedBubbleSort(arr);
        
        //ptint the sorted arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        

    }
}
