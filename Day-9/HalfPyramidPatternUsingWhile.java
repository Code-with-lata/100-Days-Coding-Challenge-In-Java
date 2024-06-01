public class HalfPyramidPatternUsingWhile {
    public static void halfPyramin(int n){
        int total_number_of_line = n;

        int spaces = n-1;
        int stars =1;

        int current_number_of_line = 1;

        while (current_number_of_line <= total_number_of_line) {
            //print spaces
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            } 
            //print star
            for(int i=1;i<=stars;i++){
                System.out.print("*");
            }
            //prepare for next line
            System.out.println();
            current_number_of_line++;
            spaces--;
            stars++;
            
        }
    }
    public static void main(String[] args) {
        int n = 5;
        halfPyramin(n);
        
    }
    
}
