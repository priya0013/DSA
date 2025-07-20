class Solution {
    public int largestAltitude(int[] gain) {
        int cumulative=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
           // gain[0]=0;
            cumulative+=gain[i];
            gain[i]=cumulative;
        
            if(gain[i]>max){
                max=gain[i];
            }
        }
        
        return max;
    }
}