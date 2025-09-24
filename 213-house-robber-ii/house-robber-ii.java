class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int skip_l=0,skip_f=0;
        if(n<2) return nums[0];
        int last[]=new int[n-1];
        int first[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            last[i]=nums[i];
            first[i]=nums[i+1];
        skip_l=robs(last);
        skip_f=robs(first);
        }
        return Math.max(skip_l,skip_f);
    }
    private static int robs(int[] nums){
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[nums.length-1];
    }
}