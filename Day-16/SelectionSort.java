public class SelectionSort {
    public static void selection_Sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int pos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[pos]<arr[j]){
                    pos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
        System.out.println("Sortes order : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    } 
    public static void main(String[] args) {
        int arr[] = {2,7,4,8};
        selection_Sort(arr);
    }
}
