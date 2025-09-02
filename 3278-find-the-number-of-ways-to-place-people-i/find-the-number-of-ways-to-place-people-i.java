class Solution {
    public int numberOfPairs(int[][] points) {
        int len=points.length;
        int cnt=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(i==j){
                    continue;
                }
                int a=points[i][0];
                int b=points[j][0];
                int c=points[i][1];
                int d=points[j][1];
                if(a<=b && c>=d){
                    boolean yes=true;
                  
                
                for(int k=0;k<len;k++){
                    if(k==i || k==j){
                        continue;
                    }
                    int r=points[k][0];
                    int q=points[k][1];
                    if(a<=r && b>=r && d<=q && c>=q){
                        yes=false;
                        break;
                    }
                }
                if(yes)cnt++;
                }
                
            }
        }
        return cnt;
    }
}