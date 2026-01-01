class Solution {
    public int maxArea(int[] he) {
        int l=0;
        int r=he.length-1;
        int mx=0;
        while(l<r){
            int cur=Math.min(he[r],he[l]);
            mx=Math.max(cur*(r-l),mx);
            if(he[l]<he[r]){
                l++;
            }else{
                r--;
            }
        }
        return mx;
    }
}