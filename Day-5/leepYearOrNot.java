import java.util.*;

public class leepYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you year" );
        int year = sc.nextInt();
       
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Year is  a leep year");
                }
                else{
                    System.out.println("Year is not a leep year");
                }
            }
            else{
                System.out.println("Year is a leep year");
            }
        }
        else{
            System.out.println("Year is not a leep year");
        }
    }
    
}
