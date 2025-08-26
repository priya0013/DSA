class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max=0;
        int mul=0;
        double diagonalsum=0;
        for(int i=0;i<dimensions.length;i++){
            int length=dimensions[i][0];
            int width=dimensions[i][1];
            diagonalsum=(length*length)+(width*width);
            if(diagonalsum>max){
                max=diagonalsum;
                mul=length*width;
            }else if(diagonalsum==max){
                mul=Math.max(mul,length*width);
            }
        }
        return mul;
    }
}