class Solution {
    public int[] replaceElements(int[] arr) {
        int l=0;
        int r=arr.length-1;
        int prev=-1;
        for(int i=r;i>=l;i--){
            int cur=arr[i];
            arr[i]=prev;
            if(cur>prev){
                prev=cur;
            }
        }
        return arr;
    }
}