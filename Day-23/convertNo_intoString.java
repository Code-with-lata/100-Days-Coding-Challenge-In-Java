public class convertNo_intoString {
    static String array[] ={"zero","one", "two" ,"three", "four", "five", "six", "seven", "eigth", "nine"};
    public static void printDigit(int num){
       
       if(num == 0){
           return;
        }
       int lastDigit = num %10;
       printDigit(num/10);
       
       System.out.println(array[lastDigit]+ " ");
    }

    public static void main(String[] args) {
        
        int num = 8239;
        printDigit(num);
    }
}
