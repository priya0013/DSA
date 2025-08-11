class Solution {
    public int maxArea(int[] h) {
        int l=0;
        int r=h.length-1;
        int max=0;
        while(l<r){
            int width=r-l;  //7-1=6
            int height=Math.min(h[l],h[r]);//min(1,6)=1
            max=Math.max(max,(width*height));//6
        
        if(h[l]<h[r]){
            l++;//move left(front)
        }else{
            r--;//move right(reverse)
        }
        }
        return max;

    }
}