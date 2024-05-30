public class CheckEvenOrNot {
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean ans = isEven(45);
        System.out.println(ans);
    }
    
}
