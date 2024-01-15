public class MatrixMath {
    public int[][] getSum(int[][] matrix1, int[][] matrix2) {

        int n = matrix1.length;
        int m = matrix1[0].length;

        int[][] sumMatrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sumMatrix;
    }

    public void printMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println("matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
