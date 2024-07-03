public class Odd_EvenInBitWiseOperator {
    public static void OddEven(int num){
        int bitmask = 1;
        if((num & bitmask) == 0){
            System.out.println("num is even");
        }
        else{
            System.out.println("num is odd");
        }
    }
    public static void main(String[] args) {
        OddEven(5);
        
    }
}