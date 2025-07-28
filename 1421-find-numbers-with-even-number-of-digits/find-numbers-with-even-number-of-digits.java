class Solution {
    public int findNumbers(int[] nums) {
        
        int cnt=0;
        for(int i:nums){
            int count=0;
            while(i>0){
                count=count+1;
                i/=10;
            }
        
            if(count%2==0){
                cnt++;
            }
        }
        
        return cnt;
    }
}