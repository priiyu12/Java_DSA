//Write a java code to create 2*2 matrix and print on terminal
public class PrintMatrix {
    public static void main(String[] args) {
        int[][] mat = { {1, 2}, {3, 4} }; // Initialize a 2x2 matrix

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
