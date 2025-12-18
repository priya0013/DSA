
class Solution {
public:
long sum=0;
    void dfs(vector<vector<int>>& grid,int r,int c){
        if(r<0 || c<0 || r>=grid.size() || c>=grid[0].size()){
            return;
        }
        if(grid[r][c]>0){
             sum+=grid[r][c];
            grid[r][c]=0;
            dfs(grid,r,c+1);
            dfs(grid,r+1,c);
            dfs(grid,r,c-1);
            dfs(grid,r-1,c);

        }
    }
    
    int countIslands(vector<vector<int>>& grid, int k) { 
        int cnt=0;
        int mx=0;
        for(int r=0;r<grid.size();r++){
            for(int c=0;c<grid[0].size();c++){
                if(grid[r][c]>0){
                    sum=0;
                    dfs(grid,r,c);
                    
                    if(sum%k==0){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
};

