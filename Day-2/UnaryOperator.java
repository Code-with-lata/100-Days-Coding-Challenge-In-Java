public class UnaryOperator {
    public static void main(String[] args) {
        //incerment Operator
        int a = 10;
        int b = a++;// post increment operator
        System.out.println(a);
        System.out.println(b);

        int x = 15;
        int y = ++x;// pre increment operator
        System.out.println(x);
        System.out.println(y);

        //decrement Operator
        int p = 18;
        int q = --p;//pre decrement operator
        System.out.println(p);
        System.out.println(q);

        int r = 21;
        int s = r--;//post decrement operator
        System.out.println(r);
        System.out.println(s);

    }
    
}
