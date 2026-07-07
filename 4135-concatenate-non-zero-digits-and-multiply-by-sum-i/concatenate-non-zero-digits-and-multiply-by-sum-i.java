class Solution {
    public long sumAndMultiply(int n) {
        long no_zero=0;
        long sum=0;
        long pow=1;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            
            if(rem!=0){
                no_zero+=rem*pow;
                pow*=10;
                
                
            }
            n/=10;
            
        }
        return no_zero*sum;
    }
}