class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int i=0;
        int res=0;
        while(i<nums.length){
            int cnt=0;
            for(int j=i;j<nums.length;j++){
                cnt+=(nums[j]==target)?1:-1;
                if(cnt>0){
                    ++res;
                }
            }
            i++;
        }
        return res;
    }
}