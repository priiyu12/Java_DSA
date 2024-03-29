//Write a java code to create an array of 3*3 matrix and perform addition operation

class MatrixAddition{
    public static void main(String[] args) {
        int[][] mat1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};;//initialized mat1
        int[][] mat2 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};//initialized mat1
        int[][] mat3 = new int[3][3];//declared new matrix to store the sum

        //mat3 = mat1 + mat2 (sum of elements of mat1 & mat2)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat3[i][j] = mat1[i][j]+mat2[i][j];
            }
            System.out.println(); // Move to the next line after printing each row
        }

        //printing mat3
        for(int[] mat : mat3){
            for(int val : mat){
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
