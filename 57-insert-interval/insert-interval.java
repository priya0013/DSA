class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int res[][]=new int[intervals.length+1][2];
        int k=0;
        int i=0;
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            res[k++]=intervals[i++];
        }
        while(i<intervals.length && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        res[k++]=newInterval;
        while(i<intervals.length){
            res[k++]=intervals[i++];
        }
        return Arrays.copyOf(res,k);
    }
}