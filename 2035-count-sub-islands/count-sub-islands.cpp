class Solution {
public:
    int m,n;
    int dfs(vector<vector<int>>& g1, vector<vector<int>>& g2,int i,int j){
        //int n=g1.size();
        if(i<0 || j<0 || i>=m || j>=n || g2[i][j]==0){
            return  true;
        }
        g2[i][j]=0;
        bool sub=g1[i][j]==1;
        bool up=dfs(g1,g2,i+1,j);
        bool dow=dfs(g1,g2,i-1,j);
        bool l=dfs(g1,g2,i,j+1);

        bool r=dfs(g1,g2,i,j-1);
        return sub & up & dow&& l& r;


    }
    int countSubIslands(vector<vector<int>>& grid1, vector<vector<int>>& grid2) {
        int cnt=0;
        m=grid2.size();
        n=grid2[0].size();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid2[i][j]==1){
                    if(dfs(grid1,grid2,i,j)){
                         cnt++;
                    }
                }
            }
        }
        return cnt;
    }
};