public class SumOfNumbers {
    public static int findSum(int n){
        int sum =0;
        if(n==1){
            return 1 ;
        }
        sum = n+ findSum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findSum(n));
    }
}
