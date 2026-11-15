class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int mx=nums[0];
        for(int x=1;x<nums.length;x++){
            sum=Math.max(sum+nums[x],nums[x]);
            mx=Math.max(mx,sum);
        }
        return mx;
    }
}