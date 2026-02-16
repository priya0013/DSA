class Solution {
    public int maxArea(int[] h) {
        int l=0;
        int r=h.length-1;
        int mx=0;
        while(l<r){
            int area=(r-l)*Math.min(h[l],h[r]);
            if(h[l]<h[r]){
                l++;
            }else{
                r--;
            }
            mx=Math.max(mx,area);
        }
        return mx;
    }
}