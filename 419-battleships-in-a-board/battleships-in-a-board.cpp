class Solution {
public:
    void dfs(vector<vector<char>>& grid,int r,int c){
        if(r<0 || c<0 || r>=grid.size() || c>=grid[0].size()){
            return;
        }
        if(grid[r][c]=='X'){
            grid[r][c]=' ';
            dfs(grid,r,c+1);
            dfs(grid,r+1,c);
            dfs(grid,r,c-1);
            dfs(grid,r-1,c);

        }
    }
    
    int countBattleships(vector<vector<char>>& board) { 
        int cnt=0;
        for(int r=0;r<board.size();r++){
            for(int c=0;c<board[0].size();c++){
                if(board[r][c]=='X'){
                    dfs(board,r,c);
                    cnt++;
                }
            }
        }
        return cnt;
    
    }
    
};

