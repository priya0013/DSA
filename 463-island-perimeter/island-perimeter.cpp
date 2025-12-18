class Solution {
public:
    int cnt=0;
    void dfs(vector<vector<int>> &grid,int r,int c){
        if(r<0 || c<0 || r>=grid.size()||c>=grid[0].size()||grid[r][c]==0){
            cnt++;
            return;
        }
       
        if(grid[r][c]==2)
            return;
            grid[r][c]=2;
            dfs(grid,r+1,c);
            dfs(grid,r-1,c);

            dfs(grid,r,c-1);

            dfs(grid,r,c+1);

        
    }
    int islandPerimeter(vector<vector<int>>& grid) {
        for(int r=0;r<grid.size();r++){
            for(int c=0;c<grid[0].size();c++){
                if(grid[r][c]==1){
                    dfs(grid,r,c);
                    return cnt;
                }
            }
        }
        return 0;
    }
};