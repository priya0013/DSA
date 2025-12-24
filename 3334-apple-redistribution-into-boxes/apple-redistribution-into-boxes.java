class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int cnt=0;
        int sum=0;
       
        Arrays.sort(capacity);
        int i=capacity.length-1;
        
        for(int a:apple){
            sum+=a;
        }
        while(sum>0){
            sum-=capacity[i];
            i--;
            cnt++;
        }
       
        return cnt;
    }
}