class Solution {
    public int findNonMinOrMax(int[] nums) {
       PriorityQueue<Integer> pq1=new PriorityQueue<>();
       PriorityQueue<Integer> pq2=new PriorityQueue<>(Collections.reverseOrder());
       for(int x:nums){
        pq1.offer(x);
        pq2.offer(x);
       }
       pq1.poll();
       pq2.poll();
       if(nums.length<=2){
        return -1;
       }
       return pq1.peek(); 

    }
}