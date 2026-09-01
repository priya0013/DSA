class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int maxid=0;
        int minid=0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[minid]){
                minid=i;
            }
            if(nums[i]>nums[maxid]){
                maxid=i;
            }
        }
        int left=Math.min(maxid,minid);
        int right=Math.max(maxid,minid);
        int both_on_left=right+1;
        int both_on_right=n-left;
        int one_on_left_and_on_right=(left+1)+(n-right);
        return Math.min(both_on_left,Math.min(both_on_right,one_on_left_and_on_right));
    }
}