import java.lang.StringBuilder;
public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(char ch ='a';ch<='z';ch++){
            sb.append(ch);
        }
        //O(n^2)
        System.out.println(sb);
    }

   

    

    
}
