//Write a java code to perform addition of two matrix

public class AddMatrix {
    public static void main(String[] args) {
        int[][] mat1 = { {1, 2}, {3, 4} }; // Initialize a 2x2 matrix
        int[][] mat2 = { {4, 3}, {2, 1} }; // Initialize a 2x2 matrix
        int[][] mat3 = new int[2][2]; // Initialize a 2x2 matrix

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat3[i][j] = mat1[i][j]+mat2[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
