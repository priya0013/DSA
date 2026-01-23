class Solution {
    public double myPow(double x, int n) {
        long t=n;
        if(n<0){
            x=1/x;
            t=-t;
        }
        double res=1;
        while(t>0){
            if(t%2==1){
                res*=x;
            }
            x*=x;
            t/=2;
        }
        return res;
    }
}