class Solution {
    public int countSquares(int[][] matrix) {
        int n=matrix.length;
        int row=n;
        int col=matrix[0].length;
        int arr[][]=new int[row+1][col+1];
        int ans=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==1){
                    arr[i+1][j+1]=Math.min(Math.min(arr[i][j+1],arr[i+1][j]),arr[i][j])+1;
                    ans+=arr[i+1][j+1];
                }
            }
        }
        return ans;
    }
}