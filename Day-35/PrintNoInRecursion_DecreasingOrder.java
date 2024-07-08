public class PrintNoInRecursion_DecreasingOrder {
    public static int printNo_DecreasingOrder(int n){
        if(n == 1){
           System.out.println(n); 
           return n;
        }
        System.out.print(n+" ");
        return printNo_DecreasingOrder(n-1);
        

    }
    public static void main(String[] args) {
        int n =10;
        printNo_DecreasingOrder(n);
    }
}
