import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num :");
        int num = sc.nextInt();
        if(num %2 == 0){
            System.out.println("Enter num is even");
        }
        else{
            System.out.println("Enter num is Odd");
        }
    }
    
}
