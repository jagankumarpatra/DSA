class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                
                if (mat[i][j] == 1 && validate(mat, i, j)) {
                    count++;
                }

            }
        }

        return count;
    }

    public boolean validate(int[][] mat, int row, int col) {

        // check row
        for (int j = 0; j < mat[row].length; j++) {
            if (j != col && mat[row][j] == 1) {
                return false;
            }
        }

        // check column
        for (int i = 0; i < mat.length; i++) {
            if (i != row && mat[i][col] == 1) {
                return false;
            }
        }

        return true;
    }
}