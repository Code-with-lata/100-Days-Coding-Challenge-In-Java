public class BinarySearch {
    public static void binarySearch(int arr[],int target){
         int lo = 0;
         int hi =arr.length-1;
         int index = -1;

         while(lo<=hi){
            int mid = (lo+hi)/2;

            if(arr[mid]==target){
                index = mid;
                break;
            }
            else if(arr[mid]<target){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
         }
         System.out.println("Element found at index : " +index);

    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int target =10;
        binarySearch(arr, target);

    }
    
}
