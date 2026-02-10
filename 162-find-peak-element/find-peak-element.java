class Solution {
    public int findPeakElement(int[] nums) {
        int mx=Integer.MIN_VALUE;
        //if(nums.length<=1)return 0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mx){
                mx=nums[i];
                res=i;
            }
        }
        return res;
    }
}