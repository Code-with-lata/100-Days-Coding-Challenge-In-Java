//count how many times lowercase vowels occured in a string entered by the user

import java.util.Scanner;

public class find_lower_Case_Vowel_Count {
    public static int findlowerCaseVowelCount(String str){
        int len = str.length();
        int vowelCount = 0;

        for(int i=0;i<len;i++){
            char ch = str.charAt(i);

            if(Character.isLowerCase(ch)==true){
                if(ch =='a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u'){
                    vowelCount++;
                }
            }
        }
        return vowelCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int vowelCount = findlowerCaseVowelCount(str);

        System.out.println("The vowels of the string is : " +vowelCount);
    }
}
