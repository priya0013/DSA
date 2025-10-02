class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int full=numBottles;
        int consume=0;
        while(full>0){
            if(full>=numExchange){
                consume+=full-(full % numExchange);
                full=(full % numExchange)+(full/numExchange);
            }else{
                consume+=full;
                full=0;
            }
        }
        return consume;
    }
}