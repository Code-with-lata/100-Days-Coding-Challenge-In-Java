import java.util.Arrays;

public class InbuiltSort {
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        
        int arr1[] ={5,4,1,3,2};
        Arrays.sort(arr1, 0, 3);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr1[i]+ " ");
        }






    }
    
}