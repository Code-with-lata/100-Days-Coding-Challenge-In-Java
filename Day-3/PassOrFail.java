import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        
        //ternary Operator
        String result = ((marks >= 33) ? "PASS" : "FAIL");
        System.out.println(result);
        sc.close();
    }
}
