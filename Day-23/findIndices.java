//for a given integer array size N.you hava to findall the occurrences
//(indices) of the given element(key)

public class findIndices {
    public static void findIndices(int arr[],int index,int key){
        
        if(index < arr.length){
            if(arr[index] == key){
                System.out.println(index + " ");
            }
            findIndices(arr,index+1, key);
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        System.out.println(findIndices(arr,0,key));
    }
    
}
