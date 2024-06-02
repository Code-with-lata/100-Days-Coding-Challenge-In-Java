public class DiamondPattern {
    public static void diamond_Pattern(int n){
        int total_number_of_line = 2*n-1;

        int stars =1;
        int spaces = n-1;
        
        //first half
        for(int j=1;j<=total_number_of_line;j++){
            //print space
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }
            for(int i=1;i<=stars;i++){
                System.out.print("*");
            }

            //prepare for the next line
            System.out.println();
            if(j<n){
                stars +=2;
                spaces--;
            }
            else{
                stars -=2;
                spaces++;
            }    
        }
    }
    public static void main(String[] args) {
        diamond_Pattern(7);
    }
    
}
