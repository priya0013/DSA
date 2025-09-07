class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        int ele=0;
        for(int i=1;i<=n/2;i++){
            
            arr[ele++]=i;
            arr[ele++]=-i;
        }
        return arr;
    }
}