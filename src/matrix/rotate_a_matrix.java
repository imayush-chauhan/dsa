package matrix;

public class rotate_a_matrix {

    static void hmm(int[][] matrix){

        int m = matrix.length;
        int n = matrix[0].length;

        int[] a = new int[m*n];

        int p = 0;

        for (int i = 0; i < n; i++) {
            for (int j = m-1; j >= 0; j--) {
                a[p++] = matrix[j][i];
            }
        }

        p = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = a[p++];
            }
        }

    }

    public static void main(String[] args) {

        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        hmm(a);

    }

}
