class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        for(int x:nums){
            nums[i]=x*x;
            i++;
        }
        Arrays.sort(nums);
        return nums;
    }
}