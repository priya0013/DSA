class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int mx=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.max(sum+nums[i],nums[i]);
            mx=Math.max(mx,sum);
        }
        return mx;
    }
}