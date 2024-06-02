public class Zer0OneTriangle {
    public static void zero_One_triangle(int n){
        // int total_number_of_line = n;
        // int stars = 1;
        // int spaces = n-1;
        // int current_number_of_line = 1;
        // while ((current_number_of_line <= total_number_of_line)) {
        //print star
           for(int i=1;i<=n;i++){
                for (int j = 1; j <=i; j++){  
                    if((i+j) % 2 ==0){
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    } 
                }
                System.out.println();
            }
           //print spaces
        //    for(int i=1;i<=spaces;i++){
        //        System.out.print(" ");
        //    }

        //prepare for the next line
           
        //    stars++;
        //    spaces--;
           
        //    current_number_of_line++;
        
    }
    public static void main(String[] args) {
        zero_One_triangle(5);
    }
    
}
