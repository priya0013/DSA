class Solution {
    public int count=0;
    public void dfs(int [][]arr,int i,int j){
        if(i<0||j<0||i>=arr.length||j>=arr[0].length||arr[i][j]==0){
            count++;
            return ;
        }
        if(arr[i][j]==2){
            return ;
        }
        arr[i][j]=2;
        dfs(arr,i+1,j);
        dfs(arr,i-1,j);
        dfs(arr,i,j+1);
        dfs(arr,i,j-1);

    }
    public int islandPerimeter(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    dfs(grid,i,j);
                    return count;
                }
            }
        }
        return 0;
    }
}