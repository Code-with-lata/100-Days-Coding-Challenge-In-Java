public class factorialNo {
    public static int factorial_No(int n){
        if(n == 1){
            return 1;
        }
        int fact1 = factorial_No(n-1);
        int fact = n* fact1;
        return fact;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("factorial of" + n + "is" + factorial_No(n));
    }

    
}