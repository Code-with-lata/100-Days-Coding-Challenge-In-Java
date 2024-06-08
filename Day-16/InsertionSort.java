public class InsertionSort {
    public static void insertion_Sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int curr =arr[i];

            while (j>=0 && arr[j]<curr) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        System.out.println("Sorted order : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5};
        insertion_Sort(arr);
    }
}
