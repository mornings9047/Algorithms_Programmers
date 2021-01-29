package level01;

public class Matrix {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] matrix = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++)
                matrix[i][j] = arr1[i][j] + arr2[i][j];
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] arr3 = {{1}, {2}};
        int[][] arr4 = {{3}, {4}};

        Matrix matrix = new Matrix();
        for (int[] arr : matrix.solution(arr1, arr2)) {
            for (int a : arr)
                System.out.print(a + " ");
            System.out.println();
        }

        for (int[] arr : matrix.solution(arr3, arr4)) {
            for (int a : arr)
                System.out.print(a + " ");
            System.out.println();
        }
    }
}
