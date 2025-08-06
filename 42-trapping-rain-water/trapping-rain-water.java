class Solution {
    public int trap(int[] h) {
        int l[]=new int[h.length];
        int r[]=new int[h.length];
        int max=-1;
        for(int i=0;i<h.length;i++){
            if(h[i]>max){
                max=h[i];
            }
            l[i]=max;
        }
        max=-1;
        for(int j=h.length-1;j>=0;j--){
            if(h[j]>max){
                max=h[j];
            }
            r[j]=max;
        }
        int min=0;
        for(int i=0;i<h.length;i++){
            min+=Math.min(l[i],r[i])-h[i];
        }
        return min;
    }
}