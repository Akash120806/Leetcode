
class Solution {
    int[][][] dp;
    int m, n;

    public int cherryPickup(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        dp = new int[m][n][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                java.util.Arrays.fill(dp[i][j], -1);
            }
        }

        return solve(0, 0, n - 1, grid);
    }

    int solve(int row, int c1, int c2, int[][] grid) {

        // Out of bounds
        if (c1 < 0 || c1 >= n || c2 < 0 || c2 >= n)
            return Integer.MIN_VALUE;

        // Already calculated
        if (dp[row][c1][c2] != -1)
            return dp[row][c1][c2];

        // Collect cherries from current cells
        int cherries = grid[row][c1];

        if (c1 != c2)
            cherries += grid[row][c2];

        // Last row
        if (row == m - 1)
            return dp[row][c1][c2] = cherries;

        int max = 0;

        // Try all 9 combinations of movements
        for (int d1 = -1; d1 <= 1; d1++) {
            for (int d2 = -1; d2 <= 1; d2++) {

                max = Math.max(max,
                    solve(row + 1, c1 + d1, c2 + d2, grid));
            }
        }

        return dp[row][c1][c2] = cherries + max;
    }
}
