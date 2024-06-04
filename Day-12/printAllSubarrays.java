public class printAllSubarrays {
    public static void printSubArray(int arr[]){
        int totalArray = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                 for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+ " ");
                 }
                 totalArray++;
                 System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Array : " +totalArray);
    }
    public static void main(String[] args) {
        int arr[] = {9,4,7,3,10,12};
        printSubArray(arr);
        
    }
    
}
