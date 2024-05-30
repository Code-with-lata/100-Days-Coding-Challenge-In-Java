import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        int factorial = 1;
        for(int i =n;i>=1;i--){//(int i=1;i<=n;i++)
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = fact(n);
        System.out.println(n+ " factorial is : " +f);
    }
    
}
