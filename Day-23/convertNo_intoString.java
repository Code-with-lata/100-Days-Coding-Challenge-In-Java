public class convertNo_intoString {
    public static void printDigit(int num){
       String[] array ={"one", "two" ,"three", "four", "five", "six", "seven", "eigth", "nine"};
       if(num == 0){
           return;
        }
       int lastDigit = num %10;
       printDigit(num/10);
       
       System.out.println(array[lastDigit]+ " ");
    }

    public static void main(String[] args) {
        // String[] array ={"one", "two" ,"three", "four", "five", "six", "seven", "eigth", "nine"};
        int num = 1239;
        printDigit(num);
    }
}
