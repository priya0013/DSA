class Solution {
    public int findKthPositive(int[] arr, int k) {
        int j=0;
        for(int i=1;;i++){
            if(j<arr.length && arr[j]==i){
                j++;
            }else{
                k--;
                if(k==0){
                    return i;
                }
            }
        }
        //return j;
    }
}