class Solution {
    public int repeatedNTimes(int[] nums) {
        
        int mx=0;
        for(int x:nums){
            mx=Math.max(mx,x);
        }
        int freq[]=new int[mx+1];
        for(int i:nums){
            freq[i]++;
        
        if(freq[i]>=2){
            return i;
        }
        }
        return -1;
    }
}