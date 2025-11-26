class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        final int MOD = 1_000_000_007;
        int m = grid.length, n = grid[0].length;
        
        int[][] dp = new int[n][k];
        dp[0][grid[0][0] % k] = 1;

        for (int i = 0; i < m; i++) {
            int[][] newDp = new int[n][k];
            for (int j = 0; j < n; j++) {
                int v = grid[i][j];

                if (i == 0 && j == 0) {
                    newDp[0][v % k] = 1;
                    continue;
                }

                for (int r = 0; r < k; r++) {

                    // From top
                    if (dp[j][r] != 0) {
                        int nr = (r + v) % k;
                        newDp[j][nr] = (newDp[j][nr] + dp[j][r]) % MOD;
                    }

                    // From left
                    if (j > 0 && newDp[j - 1][r] != 0) {
                        int nr = (r + v) % k;
                        newDp[j][nr] = (newDp[j][nr] + newDp[j - 1][r]) % MOD;
                    }
                }
            }
            dp = newDp;
        }

        return dp[n - 1][0];
    }
}
