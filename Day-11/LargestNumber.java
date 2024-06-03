public class LargestNumber {
    public static int largest_number(int number[]){
        int largestNo = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
             if( largestNo < number[i]){
                 largestNo = number[i];
                 
             }
        }
        return largestNo;
    }
    public static void main(String[] args) {
        int number[] = {1,2,6,3,5};
        int largest = largest_number(number);
        System.out.println("largest value is : "+largest);
    }
    
}
