public class product {
    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 6;
        int prod = multiply(a, b);
        System.out.println("product is : " +prod);
        prod = multiply(30, 10);
        System.out.println("product is : " +prod);
    }
    
}
