class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int cc=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            cc+=gas[i]-cost[i];
            if(cc<0){
                start=i+1;
                cc=0;
            }

        }
        return total>=0?start:-1;
    }
}