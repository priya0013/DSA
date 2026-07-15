class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li=new ArrayList<>();
        int l=0;
        int r=matrix[0].length-1;
        int t=0;
        int b=matrix.length-1;
        while(l<=r && t<=b){
            for(int i=l;i<=r;i++){
                li.add(matrix[t][i]);
            }
            t++;
            for(int j=t;j<=b;j++){
                li.add(matrix[j][r]);
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    li.add(matrix[b][i]);
                }
                b--;
            }
            if(l<=r){
                for(int j=b;j>=t;j--){
                    li.add(matrix[j][l]);
                }
                l++;
            }
        }
        return li;
    }
}