class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        
        int mx=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            gain[i]=sum;
            mx=Math.max(gain[i],mx);
        }
        return mx;
    }
}