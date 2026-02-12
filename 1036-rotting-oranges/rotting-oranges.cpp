class Solution {
public:
    int orangesRotting(vector<vector<int>>& grid) {
        if(grid.empty() || grid[0].empty()) return 0; 
        int n=grid.size();
        int m=grid[0].size();
       
        queue<pair<pair<int,int>,int>> q;
        vector<vector<int>> visit(n, vector<int>(m, 0));

        int fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.push({{i,j},0});
                
                    visit[i][j]=2;
                }

                
            
                if(grid[i][j]==1){
                    fresh++;
                }
            
            }
        }
        int cnt=0;
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        int rotten = 0;

        while(!q.empty()){
            int r=q.front().first.first;
            int c=q.front().first.second;
            int time=q.front().second;
            cnt=max(cnt,time);
            q.pop();
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && visit[nr][nc]==0
 && grid[nr][nc]==1){
                    q.push({{nr,nc},time+1});
                    visit[nr][nc]=2;
                    
                    rotten++;
                }
            }
        }
        if(rotten!=fresh)return -1;
        return cnt;

    }
};