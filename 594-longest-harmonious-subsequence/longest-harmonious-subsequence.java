class Solution {
    public int findLHS(int[] nums) {
        int j=0;
        int maxlen=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            while(nums[i]-nums[j]>1){
                j++;
            }
            if(nums[i]-nums[j]==1){
                maxlen=Math.max(maxlen,i-j+1);
            }

        }
        return maxlen;
    }
}