class Solution {
public:
int oldcolor;
int newcolor;
int m,n;
void dfs(vector<vector<int>> &img,int r,int c){
    if(r<0 || c<0 || r>=m || c>=n){
        return;
    }
    if(img[r][c]!=oldcolor){
        return;
    }
    img[r][c]=newcolor;
    dfs(img,r+1,c);
    dfs(img,r-1,c);

    dfs(img,r,c+1);

    dfs(img,r,c-1);

}
    vector<vector<int>> floodFill(vector<vector<int>>& img, int r, int c, int color) {
        m = img.size();
        n = img[0].size();
        oldcolor = img[r][c];
        newcolor = color;
                if(oldcolor==newcolor){
                    return img;
                   
                    
                }
                 dfs(img,r,c);

       
                 return img;

    }
};