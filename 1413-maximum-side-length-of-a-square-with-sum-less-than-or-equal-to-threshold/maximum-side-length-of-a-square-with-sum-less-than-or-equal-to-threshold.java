class Solution {
    public int maxSideLength(int[][] mat, int threshold) {

        int m = mat.length;
        int n = mat[0].length;

        // 1. Prefix sum array
        int[][] pre = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                pre[i][j] = mat[i - 1][j - 1]
                          + pre[i - 1][j]
                          + pre[i][j - 1]
                          - pre[i - 1][j - 1];
            }
        }

        int low = 0, high = Math.min(m, n);
        int ans = 0;

        // 2. Binary search on side length
        while (low <= high) {
            int mid = (low + high) / 2;

            if (isPossible(pre, mid, threshold, m, n)) {
                ans = mid;
                low = mid + 1;   // try larger square
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    // Check if any square of size len x len is valid
    private boolean isPossible(int[][] pre, int len, int threshold, int m, int n) {

        for (int i = 0; i + len <= m; i++) {
            for (int j = 0; j + len <= n; j++) {

                int sum = pre[i + len][j + len]
                        - pre[i][j + len]
                        - pre[i + len][j]
                        + pre[i][j];

                if (sum <= threshold)
                    return true;
            }
        }
        return false;
    }
}
