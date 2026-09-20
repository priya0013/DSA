class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int cnt=0;
        mp.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int cont=sum-k;
            if(mp.containsKey(cont)){
                cnt+=mp.get(cont);

            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);

        }
        return cnt;
    }
}