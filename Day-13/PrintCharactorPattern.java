public class PrintCharactorPattern {
    public static void PrintCharactorPattern(int n){
        char ch = 'A';
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
    }
}
