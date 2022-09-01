package matrix;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class set_matrix_to_zero {

    static void hmm(int[][] matrix){

        int m = matrix.length;
        int n = matrix[0].length;
        Set<Integer> ai = new HashSet<>();
        Set<Integer> aj = new HashSet<>();


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0){
                    ai.add(i);
                    aj.add(j);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(ai.contains(i) || aj.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }


    }

    public static void main(String[] args) {

        int[][] a = {
                {1,1,1},
                {1,0,1},
                {1,1,1},
        };

        hmm(a);

    }

}
