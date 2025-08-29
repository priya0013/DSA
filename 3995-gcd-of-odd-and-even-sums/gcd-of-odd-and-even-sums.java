class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumo=0;
        int sume=0;
        for(int i=0;i<n;i++){
                sumo+=2*i;
          
                sume+=2*i+1;
           
            
        }
       return gcd(sumo,sume);
    }
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}