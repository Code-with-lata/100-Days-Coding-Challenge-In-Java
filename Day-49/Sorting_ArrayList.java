import java.util.ArrayList;
import java.util.Collections;

public class Sorting_ArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // Sorting in Ascending order
        System.out.println("Original list" +list);
        Collections.sort(list);
        System.out.println("Sorted list in Ascending Order" +list);

        // Sorting in descending Order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Sorted list in Descending Order"+list);
        
    }
}
