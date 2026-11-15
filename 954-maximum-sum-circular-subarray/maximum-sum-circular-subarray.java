class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int mx=nums[0];
        int sum1=nums[0];
        int mn=nums[0];
        int sum2=nums[0];
        int total=nums[0];
        for(int i=1;i<nums.length;i++){
            int x=nums[i];
            sum1=Math.max(sum1+x,x);
            mx=Math.max(sum1,mx);
            sum2=Math.min(sum2+x,x);
            mn=Math.min(sum2,mn);
            total+=x;
        }
        if(mx<0){
            return mx;
        }
        int ans=Math.max(mx,total-mn);
        return ans;

    }
}