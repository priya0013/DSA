class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        int l=0;
        long sum=0;
        long maxsum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            mp.put(nums[r],mp.getOrDefault(nums[r],0)+1);
            if(r-l+1==k){
            if(mp.size()==k){
                maxsum=Math.max(maxsum,sum);

            }
            mp.put(nums[l],mp.get(nums[l])-1);
            if(mp.get(nums[l])==0){
                mp.remove(nums[l]);
            }
            sum-=nums[l];
            l++;
        }
        }
        return maxsum;
    }
}