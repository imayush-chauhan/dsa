package matrix;

public class twoDSearch {

    static boolean hmm(int[][] matrix, int target){

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            int m = matrix[i].length;
            if(matrix[i][m-1] < target) continue;
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] == target){
                    return true;
                }
            }
            return false;
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] a = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60},
        };

        int t = 2;

        System.out.println(hmm(a,t));

    }

}
