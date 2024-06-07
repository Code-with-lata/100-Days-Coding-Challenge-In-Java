public class MaxSubArraySumUsingKADANES {
    public static void kadanes(int arr[]){
        int mx = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<arr.length;i++){
            currSum += arr[i];
            if(currSum<0){
                currSum = 0;
            }
            mx = Math.max(currSum, mx);
          }
          System.out.println("our max subarray sum is : " +mx);
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
        
    }
    
}
