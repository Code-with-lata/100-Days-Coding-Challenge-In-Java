public class ContainerWithMostWater {
    public static int max_area(int [] arr){
        // int max = 0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         int breadth = Math.abs(j-i);
        //         int length = Math.min(arr[i],arr[j]);
        //         int area = breadth * length;
        //         max = Math.max(area,max);
        //     }
        // }

        int max =0;
        int left = 0;
        int right = arr.length -1;
        while(left<=right){
            int area = 0;
            int length = Math.min(arr[left],arr[right]);
            int breadth = Math.abs(left-right);
            area = length*breadth;
            max = Math.max(area,max);
            if(arr[left] <= arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int maxArea = max_area(arr);
        System.out.println(maxArea);
        
    }
    
}
