class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long left = 1;
        int maxWorkerTime = 0;
        for (int time : workerTimes) {
            maxWorkerTime = Math.max(maxWorkerTime, time);}
        long right = (long) maxWorkerTime * mountainHeight * (mountainHeight + 1) / 2;
        
        
        while (left < right) {
            long mid = left + (right - left) / 2;
            
            if (canFinish(mountainHeight, workerTimes, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
    
    private boolean canFinish(int mountainHeight, int[] workerTimes, long timeLimit) {
        long totalHeight = 0;
        
        for (int workerTime : workerTimes) {
        
            long maxX = (long) ((Math.sqrt(1 + 8.0 * timeLimit / workerTime) - 1) / 2);
            totalHeight += maxX;
            if (totalHeight >= mountainHeight) {
                return true;
            }
        }
        
        return totalHeight >= mountainHeight;
    }
}