public class FloydsTrianglePattern {
    public static void floydsTriangle(int n){
        int total_number_of_line = n;
         int stars = 1;
         int spaces = n-1;
         int counter = 1;
         int current_number_of_line = 1;

         while ((current_number_of_line <= total_number_of_line)) {
            //print star
            for(int i=1;i<=stars;i++){
                System.out.print(counter+" ");
                counter++;
            }

            //print spaces
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }

            //prepare for the next line
            System.out.println();
            stars++;
            spaces--;
            
            current_number_of_line++;
         }
    }
    public static void main(String[] args) {
        floydsTriangle(5);
        
    }

    
}