public class StringComparison {
    public static void stringComparison(String s1, String s2, String s3){
        if(s1 == s2){//use (s1.equals(s2) for coparison)
            System.out.println("yes1");
        }
        else{
            System.out.println("No1");
        }
        if(s1 == s3){
            System.out.println("Yes2");
        }
        else{
            System.out.println("No2");
        }
    }
    public static void main(String[] args) {
        String s1 = "xyz";
        String s2 = "xyz";
        String s3 = new String("xyz");
        stringComparison(s1, s2, s3);
    }
}
