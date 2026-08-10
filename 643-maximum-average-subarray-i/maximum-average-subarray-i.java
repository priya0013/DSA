class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        double sum=0;
        double avg=0;
        double maxsum=Double.NEGATIVE_INFINITY;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            if(r-l+1==k){
                maxsum=Math.max(maxsum,sum);
                avg=maxsum/k;
            
            sum-=nums[l];
            l++;
            }
        }
        return avg;
    }
}