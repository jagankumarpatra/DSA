class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Step 1: Compute total sum of the grid
        int totalSum = 0;
        for (int[] row : grid) {
            for (int val : row) {
                totalSum += val;
            }
        }

        // Step 2: Try all horizontal cuts (cut between rows)
        int topSum = 0;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                topSum += grid[i][j];
            }
            if (topSum * 2 == totalSum) {
                return true;
            }
        }

        // Step 3: Compute column sums
        int[] colSums = new int[n];
        for (int[] row : grid) {
            for (int j = 0; j < n; j++) {
                colSums[j] += row[j];
            }
        }

        // Step 4: Try all vertical cuts (cut between columns)
        int leftSum = 0;
        for (int j = 0; j < n - 1; j++) {
            leftSum += colSums[j];
            if (leftSum * 2 == totalSum) {
                return true;
            }
        }

        return false;
    }
}
