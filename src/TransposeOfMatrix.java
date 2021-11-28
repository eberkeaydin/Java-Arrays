import java.util.Arrays;

public class TransposeOfMatrix {

    static int[][] Transpose(int[][] arr){
        int[][] transposedMatrix = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                transposedMatrix[j][i] = arr[i][j];
            }
        }
       return transposedMatrix;
    }

    static void Print(int[][] arr){
        System.out.println("Matrix is : " + Arrays.deepToString(arr));

        for (int[] x : arr)
        {
            for (int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------");

        System.out.println("Transpose of matrix is : " + Arrays.deepToString(Transpose(arr)));

        for (int[] x : Transpose(arr))
        {
            for (int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{2, 3, 4}, {5, 6, 4}};
        Print(matrix);
    }
}
