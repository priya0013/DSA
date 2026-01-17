class Solution {
    public long largestSquareArea(int[][] bl, int[][] tr) {
        int n=bl.length;
        long maxs=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
        
            int mxtr0= Math.min(tr[i][0], tr[j][0]);
            int mxbl0=Math.max(bl[i][0], bl[j][0]);
            int mxtr1= Math.min(tr[i][1], tr[j][1]);
            int mxbl1=Math.max(bl[i][1], bl[j][1]);
            int wid=mxtr0-mxbl0;
            int hig=mxtr1-mxbl1;
            int s=Math.min(wid,hig);
            maxs=Math.max(maxs,s);
            }
        }
        return maxs*maxs;
        
    }
}