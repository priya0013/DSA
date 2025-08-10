class Solution {
    public boolean reorderedPowerOf2(int n) {
        char count[]=new char[10];
        while(n>0){
            count[n%10]++;
            n/=10;
        }
         for (int i = 0; i < 31; i++) {
            char[] c = new char[10];
            int p=1<<i;
            while (p> 0) {
                c[p% 10]++;
                 (p)/= 10;
            }
            if (java.util.Arrays.equals(count,c)) {
                return true;
            }
        }
        return false;
        }
}