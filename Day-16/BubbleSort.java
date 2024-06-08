public class BubbleSort {
    public static void bubble_Sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array in decreasing order : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,7};
        bubble_Sort(arr);
    }
}