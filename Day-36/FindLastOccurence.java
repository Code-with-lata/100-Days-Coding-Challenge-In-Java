public class FindLastOccurence {
    public static int findLastOccurence(int arr[],int key,int i){
        if(i == arr.length-1){
            return -1;
        }
        int isFound = findLastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        //check with itself
        // if(arr[i] == key){
        //     return i;
        // }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(findLastOccurence(arr, 5, 0));
    }
}
