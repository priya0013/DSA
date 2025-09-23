class Solution {
public:
    int ups(vector<vector<int>>& o,int r,int c,vector<vector<int>>& memo){
        if(memo[r][c]!=-1) return memo[r][c];
        if(o[r][c]==1) return memo[r][c]=0;
        if(r==0 && c==0) return memo[r][c]=1;
        if(r==0) return memo[r][c]=ups(o,r,c-1,memo);
        if(c==0) return memo[r][c]=ups(o,r-1,c,memo);
        return memo[r][c]=ups(o,r,c-1,memo)+ups(o,r-1,c,memo);
    }
    int uniquePathsWithObstacles(vector<vector<int>>& ob) {
         int m=ob.size();
        int n=ob[0].size();
        vector<vector<int>> memo(m,vector<int>(n, -1));
        return ups(ob,m-1, n -1, memo);
    }
};