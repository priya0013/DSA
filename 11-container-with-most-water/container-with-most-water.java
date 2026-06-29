class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int mx=0;
        while(l<r){
            int wid=r-l;
            int hig=Math.min(height[l],height[r]);
            int area=wid*hig;
            mx=Math.max(mx,area);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return mx;
    }
}