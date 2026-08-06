class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //ithu sliding window than 
        // apo enna panuna l and r pointer la eduthu flexible size ku window va shrink and expand pananu ok 
        int l=0;
        int sum=0;
        //inga min_len na minimum length la than substring irukanu so,min
        int min_len=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                //window size minimum edukanum
                min_len=Math.min(min_len,r-l+1);
                //if window size expand aana left element ahh remove shrink aagum
                sum=sum-nums[l++];
            }
        }
        return min_len==Integer.MAX_VALUE?0:min_len;
    }
}