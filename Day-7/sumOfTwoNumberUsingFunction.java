import java.util.Scanner;

public class sumOfTwoNumberUsingFunction {
    public static void calculateSum(int a,int b){//parameters or formal parameters
        int sum = a+b;
        System.out.println("sum is: " +sum);   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        calculateSum(6,8);//arguments or actual parameters

    }
    
}
