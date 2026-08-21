class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l[]=new int[n];
        int r[]=new int[n];
        int max=-1;
        for(int i=0;i<n;i++){
            if(height[i]>max){
                max=height[i];

            }
            l[i]=max;
        }
        max=-1;
        for(int i=n-1;i>=0;i--){
            if(height[i]>max){
                max=height[i];
            }
            r[i]=max;
        }
        int mn=0;
        for(int i=0;i<n;i++){
            mn+=Math.min(l[i],r[i])-height[i];
        }
        return mn;
    }
}