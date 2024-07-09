public class PrintPower {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int Xn = x * power(x, n-1);
        return Xn;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
