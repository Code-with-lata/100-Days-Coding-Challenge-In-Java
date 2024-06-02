public class SolidRhombus {
    public static void solidRhombus(int n){
        int total_number_of_line = n;

        int stars = 5;
        int spaces = n-1;

        int current_number_of_line = 1;

        while (current_number_of_line <= total_number_of_line) {
            //print spaces
            for(int i=1;i<=spaces;i++){
                System.out.print("  ");
            }

            //print star
            for(int i=1;i<=stars;i++){
                System.out.print("* ");
            }

            //prepare for next line
            System.out.println();
            spaces--;
            current_number_of_line++;
        }
    }
    public static void main(String[] args) {
        solidRhombus(5);
    }
    
}
