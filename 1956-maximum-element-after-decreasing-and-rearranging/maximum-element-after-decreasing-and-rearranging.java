class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int res=1;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=res+1){
                res++;
            }
        }
        return res;
    }
}