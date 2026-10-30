class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        HashSet<Integer> s=new HashSet<>();
        for(int x:nums){
            if(s.add(x)){
                pq.offer(x);
            }
        }
        if(pq.size()<3){
            return pq.peek();
        }
        pq.poll();
        pq.poll();
        return pq.poll();
    }
}