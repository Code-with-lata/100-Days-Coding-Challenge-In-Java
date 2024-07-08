public class FibonacciNo {
    public static int Fibonacci(int n){
        if(n==0 || n==1){
            return n;

        }
        int fibN = Fibonacci(n-1)+Fibonacci(n-2);
        return fibN;
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(Fibonacci(n));
    }
}
