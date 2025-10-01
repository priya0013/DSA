class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int consumeBottle=0;
        while(numBottles>=numExchange){
            consumeBottle+=numExchange;
            numBottles-=numExchange;
            numBottles++;

        }
        return consumeBottle+numBottles;

    }
}