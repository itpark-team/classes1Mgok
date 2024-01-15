import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TrigMath trigMath = new TrigMath();
        SimpleMath simpleMath = new SimpleMath();
        MatrixMath matrixMath = new MatrixMath();

        System.out.println("Circle Square = " + trigMath.getCircleSquare(32));
        System.out.println("Sum  = " + simpleMath.getSum(3, 5));

        int[][] matrix1 = new int[][]{
                {3, 4},
                {5, 6}
        };
        int[][] matrix2 = new int[][]{
                {7, 8},
                {9, 1}
        };

        int[][] sumMatrix = matrixMath.getSum(matrix1, matrix2);
        matrixMath.printMatrix(sumMatrix);
    }
}