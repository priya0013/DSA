class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int e=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int t=nums[e];
                nums[e]=nums[i];
                nums[i]=t;
                e++;
            }
           
        }
        return nums;
    }
}