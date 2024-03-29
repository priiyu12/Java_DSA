import java.util.Scanner;

//Write a java code to create a Upper and Lower Triangular matrix using UDF

public class Triangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("a["+i+"]["+j+"] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Choose:");
        System.out.println("1. Upper Triangular Matrix");
        System.out.println("2. Lower Triangular Matrix");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                upper(arr);
            break;
            
            case 2:
                lower(arr);
            break;

            default :
                System.out.println("Invalid choice");

        }
    }

    static void upper(int[][] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i>j)
                System.out.print("0 ");  
                else
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void lower(int[][] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i<j)
                System.out.print("0 ");  
                else
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
