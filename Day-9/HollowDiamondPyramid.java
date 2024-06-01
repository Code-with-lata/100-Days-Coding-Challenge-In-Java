public class HollowDiamondPyramid {
    public static void hollowDiamondPattern(int n){
        int total_number_of_line = 2*n-1;
        
        int stars = 1;
        int spaces = n-1;

        int current_number_of_line = 1;
         
        while (current_number_of_line <= total_number_of_line) {
            //print spaces
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }

            // print stars and inner spaces
            if (stars == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for(int i = 1; i <= stars - 2; i++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            // prepare for next line
            System.out.println();
            if(current_number_of_line < n){
                stars +=2;
                spaces--;
            } else {
                stars-=2;
                spaces++ ;
            }
            current_number_of_line++;
        }
    }
    public static void main(String[] args) {
        hollowDiamondPattern(4);
        
    }
    
}
