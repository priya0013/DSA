class Solution {
    public boolean canJump(int[] nums) {
        int maxreach=nums[0];
        for(int i=0;i<nums.length;i++){
            if(i>maxreach)return false;
            if(nums[i]+i>maxreach){
                maxreach=nums[i]+i;
                
            }
        }
        return true;
    }
}