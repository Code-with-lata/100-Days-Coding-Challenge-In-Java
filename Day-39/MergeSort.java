public class MergeSort {
    public static void mergeSort(int arr[], int si, int ei){
        //base case
        if(si>=ei){
            return;
        }
        int mid = si+ (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);

    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int [ei-si+1];
        int i =si; //iteration for left part
        int j = mid+1; //iteration for right part
        int k = ei; //iteration for temp arr

        while(i <= mid && j <= ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copy temp to my original arr
        for(k=0, i=si; k<temp.length; k++,i++){
            arr[]
        }

    }
    public static void main(String[] args) {
        
    }
}
