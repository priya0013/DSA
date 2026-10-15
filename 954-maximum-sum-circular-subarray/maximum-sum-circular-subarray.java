class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int t=0;  
        int mns=0;
        int mn=nums[0];
        int mxs=0;
        int mx=nums[0];
        for(int i=0;i<nums.length;i++){
            mns=Math.min(nums[i],nums[i]+mns);
            mn=Math.min(mn,mns);
            mxs=Math.max(nums[i],nums[i]+mxs);
            mx=Math.max(mxs,mx);
            t+=nums[i];
        }
        if(mx<0){
            return mx;
        }
        return Math.max(mx,t-mn);
    }
}