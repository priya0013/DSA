class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int l[]=new int[n];
        int r[]=new int[n];
        int max=-1;
        for(int i=0;i<n;i++){
            if(h[i]>max){
                max=h[i];
            }
            l[i]=max;
        }
        max=-1;
        for(int j=n-1;j>=0;j--){
            if(h[j]>max){
                max=h[j];
            }
            r[j]=max;
        }
        int min=0;
        for(int i=0;i<n;i++){
            min+=Math.min(l[i],r[i])-h[i];
        }
        return min;
    }
}