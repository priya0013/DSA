class Solution {
    public int minOperations(int[][] grid, int x) {
        int r=grid.length;
        int c=grid[0].length;
        int arr[]=new int[r*c];
        int id=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[id++]=grid[i][j];
            }
        }
        Arrays.sort(arr);
        int n=arr.length;
        int rem=arr[0]%x;
        for(int ar:arr){
            if(ar%x!=rem){
                return -1;
            }
        }
        int mid=arr[n/2];
        int cnt=0;
        for(int i=0;i<r*c;i++){
            if(arr[i]<mid){
                cnt+=(mid-arr[i])/x;
            }else if(arr[i]>mid){
                cnt+=(arr[i]-mid)/x;
            }
        }
        return cnt;
    }
}