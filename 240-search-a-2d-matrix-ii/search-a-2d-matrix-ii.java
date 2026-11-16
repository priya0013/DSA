class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}