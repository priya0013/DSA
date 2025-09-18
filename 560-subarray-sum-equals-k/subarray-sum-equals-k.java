class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int cur=0;int cnt=0;
        for(int n:nums){
            cur+=n;
        
        if(mp.containsKey(cur-k)){
            cnt+=mp.get(cur-k);
        }
        mp.put(cur,mp.getOrDefault(cur,0)+1);
        }
        return cnt;

    }
}