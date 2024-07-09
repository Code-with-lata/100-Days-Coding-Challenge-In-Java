public class OptimizedPrintPower {
    public static int optimizedPower(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        if(n % 2 == 0){
            return halfPower * halfPower;
        }
        else{ 
            return x * halfPower * halfPower;
        }
    }
    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 10));
    }
}
