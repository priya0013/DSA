class Solution {
    public int maxProduct(int n) {
        int mx1=Integer.MIN_VALUE;
        int mx2=Integer.MIN_VALUE;
        int prod=1;
        int ans=0;
        while(n!=0){
            int rem=n%10;
            if(rem>=mx1){
                mx2=mx1;
                mx1=rem;
            }else if(rem>mx2){
                mx2=rem;
            }

            prod=mx1*mx2;
            ans=Math.max(ans,prod);
            n/=10;
        }
        return ans;
    }
}