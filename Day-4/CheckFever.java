import java.util.*;

public class CheckFever {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();

        if (temperature >= 103.5) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }

        // Ternary Operator
        // char isFever = (temperature >= 103.5) ? 'y' : 'N';
        // System.out.println(isFever);
    }
}
