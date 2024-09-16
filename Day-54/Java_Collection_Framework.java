import java.util.LinkedList; //JCF -->Optimized

public class Java_Collection_Framework {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();

        // add
        LL.addLast(1);
        LL.addLast(2);
        LL.addFirst(0);
        System.out.println(LL);

        // Remove
        LL.removeLast();
        LL.removeFirst();
        System.out.println(LL);
    }
}
