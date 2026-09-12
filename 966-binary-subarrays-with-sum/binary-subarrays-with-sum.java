class Solution {
    public int Sum(int[] nums, int goal) {
        int l=0;
        int z=0;
        int cnt=0;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>goal && l<=r){
                sum-=nums[l];
                l++;
            }
            cnt+=r-l+1;
                
        }
        return cnt;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return Sum(nums,goal)-Sum(nums,goal-1);
    }
}