public class FunctionOverloading {
    //function to calculate sum of 2 nums
    public static int sumOf2No(int a,int b){
        return a + b;
    }
    //function to calculate sum of 3 nums
    public static int sumOf3No(int a,int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println("Sum of two nums :" +sumOf2No(5, 7));
        System.out.println("Sum of three nums :" +sumOf3No(7, 5, 9));
    }
    
}
