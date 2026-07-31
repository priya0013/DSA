class Solution {
    public boolean searchMatrix(int[][] ma, int target) {
        int m=ma.length;
        int n=ma[0].length;
        int l=0;
        int ri=m*n-1;
        while(l<=ri){
            int mid=l+(ri-l)/2;
            int r=mid/n;
            int c=mid%n;
            if(ma[r][c]==target){
                return true;
            }else if(ma[r][c]<target){
                l=mid+1;
            }else{
                ri=mid-1;
            }
        }
        return false;
    }
}