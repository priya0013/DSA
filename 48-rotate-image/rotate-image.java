class Solution {
    public void reverse(int [][]arr){
        for(int i=0;i<arr[0].length;i++){
            int l=0;
            int r=arr[i].length-1;
            while(l<r){
                int temp=arr[i][l];
                arr[i][l]=arr[i][r];
                arr[i][r]=temp;
                l++;
                r--;
            }
        }
    }
    public void rotate(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        reverse(arr);
        
    }
}