class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int mx=0;
        while(l<r){
            int mn=Math.min(height[l],height[r]);
            mx=Math.max(mn*(r-l),mx);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }

        }
        return mx;
    }
}