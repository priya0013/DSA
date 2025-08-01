class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> cur=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    cur.add(1);
                }else{
                    int le=l.get(i-1).get(j-1);
                    int ri=l.get(i-1).get(j);
                    cur.add(le+ri);
                }
            }
                l.add(cur);
            
          
        }
         return l;
    }
}