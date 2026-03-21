class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int r = grid.length;
        int c = grid[0].length;
        int m = (x + k) - 1;
        while (x < m) {
            for (int i = y; i <y+k; i++) {
                int sum = grid[x][i] + grid[m][i];
                grid[m][i] = grid[x][i];
                grid[x][i] = sum - grid[m][i];
                //   y=y+k-1;
            }
        
            x++;
            m--;
        }
        return grid;
    }

}