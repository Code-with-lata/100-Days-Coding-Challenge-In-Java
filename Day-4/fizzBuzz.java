import java.util.*;


public class fizzBuzz {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();

        if(num % 3 == 0 || num % 5 != 0){
          //multiple of 3
          System.out.println("Fizz");
        } else if(num % 5 == 0 && num %3 != 0){
            //multiple of 5
            System.out.print("Buzz");
        }else if(num % 3 == 0 && num % 5 == 0){
            //multiple of 3 or 5
            System.out.print("FizzBuzz");
        }else {
            //nither multiple of 3 or 5
            System.out.print(num);
        }
    }
}
