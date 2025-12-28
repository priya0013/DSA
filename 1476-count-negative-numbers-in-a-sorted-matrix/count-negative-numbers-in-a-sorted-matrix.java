class Solution {
    public int countNegatives(int[][] grid) {
        int cnt=0;
        int n=grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}