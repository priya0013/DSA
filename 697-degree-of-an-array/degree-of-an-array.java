class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int maxfreq=0;
        int min=Integer.MAX_VALUE;
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
            maxfreq=Math.max(maxfreq,mp.get(x));
        }
        for(int x:mp.keySet()){
            if(mp.get(x)==maxfreq){
            int first=-1;
            int second=-1;
            for(int i=0;i<nums.length;i++){
                
                if(x==nums[i]){
                    if(first==-1){
                    first=i;
                    }
                
                    second=i;
                }
                
            }
        
            int len=second-first+1;
            min=Math.min(len,min);
            }
        }
            return min;


    }
}