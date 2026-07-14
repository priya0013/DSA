class Solution {

    int MOD = 1000000007;
    Integer[][][] dp;

    public int subsequencePairCount(int[] nums) {

        int max = 0;

        for(int x: nums)
            max = Math.max(max, x);

        dp = new Integer[nums.length + 1][max + 1][max + 1];

        return dfs(0,0,0,nums);
    }

    int dfs(int i,int g1,int g2,int[] nums){

        if(i==nums.length){

            if(g1==g2 && g1!=0)
                return 1;

            return 0;
        }

        if(dp[i][g1][g2]!=null)
            return dp[i][g1][g2];

        int a = dfs(i+1,gcd(g1,nums[i]),g2,nums);

        int b = dfs(i+1,g1,gcd(g2,nums[i]),nums);

        int c = dfs(i+1,g1,g2,nums);

        return dp[i][g1][g2]=((a+b)%MOD+c)%MOD;
    }

    int gcd(int a,int b){

        if(a==0) return b;

        while(b!=0){

            int t=b;

            b=a%b;

            a=t;
        }

        return a;
    }
}