public class NumberPyramid {
    public static void numberPyramid(int n){
        int total_number_of_line = n;
        int stars = 1;
        int spaces = n-1;

        int current_number_of_line = 1;
        while (current_number_of_line <= total_number_of_line) {
            //print spaces
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }

            //print stars
            for(int i=1;i<=stars;i++){
                System.out.print(i+ " ");
            }

            //prepare for the next line
            System.out.println();
            current_number_of_line++;
            stars++;
            spaces--;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        numberPyramid(n);
    }
    
}
