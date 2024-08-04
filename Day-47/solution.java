public class solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // Negative numbers are not palindromes
        }
        int original_No = x;
        int reverse_No = 0;
        while (x>0){
            int digit = x%10;
            reverse_No = reverse_No * 10 +digit;
            x= x/10;
        }
        if(original_No == reverse_No){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}

