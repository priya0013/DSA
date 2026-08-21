class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int sum=0;
        int cnt=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int exist=sum-k;
            if(mp.containsKey(exist)){
                cnt+=mp.get(exist);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}