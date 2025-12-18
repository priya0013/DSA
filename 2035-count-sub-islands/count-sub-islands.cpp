class Solution {
public:
void dfs(vector<vector<int>>& grid1, vector<vector<int>>& grid2,int r, int c, bool &issub) {

    if (r < 0 || c < 0 ||r >= grid2.size() || c >= grid2[0].size()||grid2[r][c]==0 )
        return;
    if (grid1[r][c] == 0)
        issub = false;
    grid2[r][c] = 0;

    dfs(grid1, grid2, r + 1, c, issub);
    dfs(grid1, grid2, r - 1, c, issub);
    dfs(grid1, grid2, r, c + 1, issub);
    dfs(grid1, grid2, r, c - 1, issub);
}

    int countSubIslands(vector<vector<int>>& grid1, vector<vector<int>>& grid2) {
       
        int cnt=0;
        for(int r=0;r<grid2.size();r++){
            for(int c=0;c<grid2[0].size();c++){
                if(grid2[r][c]==1){
                     bool issub=true;
                    dfs(grid1,grid2,r,c,issub);
                    if(issub){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
};