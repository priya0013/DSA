class Solution {
    public List<Integer> luckyNumbers(int[][] m) {
        List <Integer> l=new ArrayList<>();
        int row=m.length;
        int col=m[0].length;
        for(int i=0;i<row;i++){
            int minval=m[i][0];
            int mincol=0;
            for(int j=1;j<col;j++){
                if(m[i][j]<minval){
                    minval=m[i][j];
                    mincol=j;
                }
            }
            boolean ismax=true;
            for(int r=0;r<row;r++){
                if(m[r][mincol]>minval){
                ismax=false;
                break;
                }
            }
            if(ismax){
                l.add(minval);
            }
        }
        return l;
    }
}