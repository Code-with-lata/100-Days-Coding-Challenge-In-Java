import java.util.Arrays;

public class CheckAnagram {
    public static void checkAnagram(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        //check the length are same or not
        if(s1.length() == s1.length()){

            //convert the array into char array
            char[] s1CharArray = s1.toCharArray();
            char[] s2charArray = s2.toCharArray();

            //sort the arrays
            Arrays.sort(s1CharArray);
            Arrays.sort(s2charArray);

            boolean result = Arrays.equals(s1CharArray, s2charArray);
            if(result){
                System.out.println(s1+ " and " +s2+ " are anagram");
            }
            else{
                System.out.println(s1+ " and " +s2+ " are not anagram");
            }
        }

    }
    public static void main(String[] args) {
        String s1 = "aabc";
        String s2 = "baca";
        checkAnagram(s1, s2);

    }
    
}
