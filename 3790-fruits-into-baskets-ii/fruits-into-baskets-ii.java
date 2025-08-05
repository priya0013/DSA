class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int cnt=0;
        
        for(int f:fruits){
            int unfitted=1;
            for(int i=0;i<baskets.length;i++){
                if(f<=baskets[i]){
                    baskets[i]=0;
                    unfitted=0;
                    break;
                }
            }
            cnt+=unfitted;
        }
        return cnt;
    }
}