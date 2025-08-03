class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int temp=nums[i];
                nums[i]=nums[s];
                nums[s]=temp;
                s++;
            }
        }
            return nums;
        
    }
}