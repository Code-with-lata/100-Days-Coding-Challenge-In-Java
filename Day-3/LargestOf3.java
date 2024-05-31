import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a>=b) && (a>=c)){
            System.out.println("a is greater than b & c");
        }
        else if(b>=c){
            System.out.println("b is greater than a & c");
        }
        else{
            System.out.println("c is greater than  a & b");
        }
    }
    
}
