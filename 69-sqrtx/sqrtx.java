class Solution {
    public int mySqrt(int n) {
        int l=0;
        int h=n;
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if((long)mid*mid==n){
                return mid;
            }else if((long)mid*mid<n){
                l=mid+1;
                ans=mid;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }
}