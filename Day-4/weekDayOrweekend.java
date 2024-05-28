import java.util.Scanner;

public class weekDayOrweekend {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dayNumber = sc.nextInt();
   
    switch(dayNumber){
        case 1: System.out.println("weekday"); break;
        case 2: System.out.println("weekday"); break;
        case 3: System.out.println("weekday"); break; 
        case 4: System.out.println("weekday"); break;
        case 5: System.out.println("weekday"); break;
        case 6: System.out.println("weekend"); break;
        case 7: System.out.println("weekend"); break; 
        default : 
             System.out.println("Invalid Day");

        // case 1: {}
        // case 2: {}
        // case 3: {}
        // case 4: {}
        // case 5: {System.out.println("weekday"); break;}
        // case 6: {}
        // case 7: {System.out.println("weekend"); break; }
        // default: {System.out.println("Invalid Day");}

        // case 1,2,3,4,5: {System.out.println("weekday"); break;}
        // case 6,7: {System.out.println("weekend"); break;}
        // default: {System.out.println("Invalid Day");}
    }
}
}