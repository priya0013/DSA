class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int t=nums[a];
                nums[a]=nums[i];
                nums[i]=t;
                a++;
            }
        }
        return nums;
    }
}