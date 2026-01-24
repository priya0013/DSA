class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int mx=0;
        for(int i=0;i<nums.length/2;i++){
            int val=nums[i]+nums[(nums.length-1)-i];
            if(val>mx){
                mx=val;
            }
        }
        return mx;
    }
}