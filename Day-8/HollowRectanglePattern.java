import java.util.Scanner;

public class HollowRectanglePattern {
    public static void hollow_rectangal(int rows,int columns){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
                if(i==1 || i==rows || j==1 || j==columns){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows :");
        int row = sc.nextInt();
        System.out.println("Enter column :");
        int column = sc.nextInt();
        hollow_rectangal(row, column);
        
         
    }
}
