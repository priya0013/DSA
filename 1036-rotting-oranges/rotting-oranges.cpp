class Solution {
public:
    int orangesRotting(vector<vector<int>>& grid) {
        int m=grid[0].size();
        int n=grid.size();
        int fresh=0;
        queue<pair<int,int>> q;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    fresh++;
                }else if(grid[i][j]==2){
                    q.push({i,j});
                }
            }
        }
            int timer=0;
            while(!q.empty() && fresh>0){
                int size=q.size();
                while(size-->0){
                    pair<int,int> p=q.front();
                    q.pop();
                    int r=p.first;
                    int c=p.second;

                    if(c+1<m && grid[r][c+1]==1){
                        grid[r][c+1]=2;
                        q.push({r,c+1});
                        fresh--;
                    }
                    if(c-1>=0 && grid[r][c-1]==1){
                        grid[r][c-1]=2;
                        q.push({r,c-1});
                        fresh--;
                    }
                    if(r+1<n && grid[r+1][c]==1){
                        grid[r+1][c]=2;
                        q.push({r+1,c});
                        fresh--;
                    }
                    if(r-1>=0 && grid[r-1][c]==1){
                        grid[r-1][c]=2;
                        q.push({r-1,c});
                        fresh--;
                    }
                }
                timer++;
            }
        
        return fresh==0?timer:-1;
    }
};