public class pallindromPyramid {
    public static void pallindromPyramid(int n){
        int total_number_of_line = 2*n-1;

        int stars = 1;
        int spaces = n-1;
        
        int current_number_of_line = 1;

        while(current_number_of_line<= total_number_of_line){
            //print space
            for(int i=1;i<=spaces;i++){
                System.out.print("  ");
            }

            //print star
            int number_to_print= 1;
            for(int i=1;i<=stars;i++){
                System.out.print(number_to_print+ " ");
                if(i<= stars/2){
                    number_to_print++;
                }
                else{
                    number_to_print--;
                }
            }

            //prepare for the next line
            System.out.println();
            if(current_number_of_line < n){
                stars +=2;
                spaces--;
            }
            else{
                stars -=2;
                spaces ++;
            }
            
            current_number_of_line++;
        }
    }
    
    public static void main(String[] args) {
        pallindromPyramid(4);
        
    }
    
}
