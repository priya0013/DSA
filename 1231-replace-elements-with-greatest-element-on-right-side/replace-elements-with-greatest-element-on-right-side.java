class Solution {
    public int[] replaceElements(int[] arr) {
        int high=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>high){
                int t=arr[i];
                arr[i]=high;
                high=t;
            }else{
                arr[i]=high;
            }
        }
        return arr;
    }
}