class Solution {
public:
    void dfs(vector<vector<int>>& land,int r,int c,int &mr,int &mc){
        if(r<0 || c<0 || r>=land.size() || c>=land[0].size()){
            return;
        }
        if(land[r][c]==1){
            land[r][c]=0;
            dfs(land,r,c+1,mr,mc);
            dfs(land,r,c-1,mr,mc);
            dfs(land,r+1,c,mr,mc);
            dfs(land,r-1,c,mr,mc);
         
        if(r>mr) mr=r;
        if(c>mc) mc=c;
        }
    
    }
    vector<vector<int>> findFarmland(vector<vector<int>>& land) {
        vector<vector<int>> res;
        for(int r=0;r<land.size();r++){
            for(int c=0;c<land[0].size();c++){
                if(land[r][c]==1){
                    int mr=r;
                    int mc=c;
                    dfs(land,r,c,mr,mc);
                    res.push_back({r,c,mr,mc});

                }
            }
        }
        return res;
    }
};