class Solution {
    public int removeDuplicates(int[] nums) {
        int freq[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
            freq[j++]=nums[i];
            }
        }
        freq[j++]=nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
                nums[i]=freq[i];
            
        }
        return j;
    }
}