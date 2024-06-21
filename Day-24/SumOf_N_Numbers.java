public class SumOf_N_Numbers {
    public static int sumOfNumbers(int n){
        
        if(n == 1){
           return 1;
        }

        int sum1 = sumOfNumbers(n-1);
        int sum = n + sum1;
        return sum;

        
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfNumbers(n));
    }
    
}
