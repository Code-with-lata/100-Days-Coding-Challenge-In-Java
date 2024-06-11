import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        //How to Declare 2D array
        int arr[][] =  {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        Scanner sc = new Scanner(System.in);
        int n= arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            System.out.println("print" +i+ "row" );
            for(int j=0;j<m;j++){
               
                System.out.print(arr[i][j]+ " " );
            }
            System.out.println();
        }

        //how to take user input
        int arr2[][] = new int[4][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("print the 2D array");

        //how to find the length of the arr
        // int num_row = arr.length;
        // int num_column = arr[0].length;
        // System.out.println(num_row);
        // System.out.println(num_column);
    }

    
    
}
