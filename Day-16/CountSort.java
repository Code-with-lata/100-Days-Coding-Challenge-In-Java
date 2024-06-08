public class CountSort {
    public static void count_Sort(int arr[]){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        int count[] = new int [max+1];

        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            count[element]++;
        }
        int k =0;
        for(int i=max;i>=0;i--){
            int freq = count[i];
            for(int j=1;j<=freq;j++){
                arr[k] =i;
                k++;
            }
        }
        System.out.println("Sorted arr is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {6,2,6,6,2,4};
        count_Sort(arr);
    }
    
}
