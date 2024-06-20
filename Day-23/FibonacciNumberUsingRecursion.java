public class FibonacciNumberUsingRecursion {
    public static int fibonacciNo(int n){
        //if(n==0 || n==1)
        if(n == 0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibonacciNo(n-1) + fibonacciNo(n-2);
        }
        //using iterative method

        // for(int i=2;i<=n;i++){
        //     int currf = f0+f1;
        //     f0 = f1;
        //     f1 = currf;
        //     System.out.println("f" + i + "" +currf);
        // }
    } 
    public static void main(String[] args) {
        int n = 6;
        System.out.println("fibonacci of " + n +  " is : " + fibonacciNo(n));
    }
}
