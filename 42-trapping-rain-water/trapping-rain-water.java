class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int mx=-1;
        for(int i=0;i<n;i++){
            if(height[i]>mx){
                mx=height[i];
            }
            left[i]=mx;
        }
        mx=-1;
        for(int i=n-1;i>=0;i--){
            if(height[i]>mx){
                mx=height[i];
            }
            right[i]=mx;
        }


        
        int mn=0;
        for(int i=0;i<n;i++){
            mn+=Math.min(left[i],right[i])-height[i];
        }
        return mn;
    }
}