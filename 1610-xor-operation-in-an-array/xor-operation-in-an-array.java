class Solution {
    public int xorOperation(int n, int start) {
        int arr[]=new int[n];
        int i=0;
        int ans=0;
        while(i<n){
            arr[i]=start+2*i;
            ans^=arr[i];
            i++;
        }
        return ans;
    }
}