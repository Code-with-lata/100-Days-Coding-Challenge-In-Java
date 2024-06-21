public class SumOf_N_Numbers {
    public static void sumOfNumbers(int n){
        
        if(n = 1){
            return 1;
        }
        int sum1 = sumOfNumber(n-1);
        int sum = n + sum1;
        return sum;

        
    }
    public static void main(String[] args) {
        int n = 5;
        sumOfNumbers(n);
    }
    
}
