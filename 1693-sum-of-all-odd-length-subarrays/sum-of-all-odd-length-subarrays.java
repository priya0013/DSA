class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int l=0;l<arr.length;l++){
            int cur=0;
            for(int r=l;r<arr.length;r++){
                cur+=arr[r];
                if((r-l+1)%2!=0){
                    sum+=cur;
            }
        }
        }
        return sum;
    }
}