import java.util.Scanner;

public class BionomialCoefficient {
    public static int factorial(int n) {
        int fact = 1;
        for(int i =n;i>=1;i--){//(int i=1;i<=n;i++)
            fact *= i;
        }
        return fact;
    }
    public static int binomialCoff(int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int bioCoff = fact_n/(fact_r * fact_nmr);
        return bioCoff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int BC = binomialCoff(n, r);
        System.out.println("The bionomial cofficent of the given number is :" +BC);
    }
    
}
