class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        int i=1;
        while(true){
            long x=num1-(long)num2*i;
            if(x<i)return -1;
            if(Long.bitCount(x)<=i){
                return i;
            }
            i++;
        }
    }
}