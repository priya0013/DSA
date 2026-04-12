class Solution {
    public int newcolor;
    public int oldcolor;
    public int cnt;
    public void dfs(int [][]arr,int i,int j){
        if(i<0||j<0||i>=arr.length||j>=arr[0].length){
            return ;
        }
        if(arr[i][j]!=oldcolor){
            return ;
        }
        arr[i][j]=newcolor;
        dfs(arr,i+1,j);
        dfs(arr,i-1,j);
        dfs(arr,i,j+1);
        dfs(arr,i,j-1);
    }
    public int[][] floodFill(int[][] img, int sr, int sc, int color) {
        int n=img.length;
        int m=img[0].length;
        oldcolor=img[sr][sc];
        newcolor=color;
        if(oldcolor==newcolor){
            return img;
        }
        dfs(img,sr,sc);
        return img;
    }
}