class Solution {
    static final int MOD = 1000000007;
    Integer[][] dp;

    public int numberOfWays(int n, int x) {
        dp = new Integer[301][n + 1];
        return countWays(1, n, x);
    }

    private int countWays(int num, int target, int x) {
        if (target == 0)
         return 1;
        if (target < 0 || Math.pow(num, x) > target)
         return 0;
        if (dp[num][target] != null)
         return dp[num][target];
        int take = countWays(num + 1, target - (int)Math.pow(num, x), x);
        int skip = countWays(num + 1, target, x);
        return dp[num][target] = (take + skip) % MOD;
    }
}
