public class CheckPalindromeOrNot {
    public static int reverse(int num){
        int revnum = 0;
        while(num > 0){
            int lastdigit = num%10;
            num = num/10;
            revnum = revnum*10 +lastdigit;
        }
        return revnum; 
    }
    public static boolean CheckPalindrome(int a){
        int reversednumber = reverse(a);
        if(reversednumber == a){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
         boolean ans = CheckPalindrome(123321);
         System.out.println(ans);
        
    }
    
}
