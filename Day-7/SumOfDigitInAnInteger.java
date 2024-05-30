public class SumOfDigitInAnInteger {
    public static int sumOfDigit(int num){
        int sum = 0;
        while(num > 0){
            //retrieve last digit
            int lastdigit = num%10;
            //delete last digit
            num = num/10;
            //add this digit to sum
            sum = sum +lastdigit;
        }
        return sum;
    }
    public static void main(String[] args) {
        int ans = sumOfDigit(1234);
        System.out.println(ans);
    }
    
}
