class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=0;i<n;i++){
            int rem=n-i;
            if(!String.valueOf(i).contains("0")&& !String.valueOf(rem).contains("0")){
                return new int[]{i,rem};
            }
        }
        return new int[0];
    }
}