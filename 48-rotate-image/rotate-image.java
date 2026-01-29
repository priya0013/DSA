class Solution {
    public void rotate(int[][] m) {
        int n=m.length;
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=m[n-j-1][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m[i][j]=arr[i][j];
            }
        }
    }
}