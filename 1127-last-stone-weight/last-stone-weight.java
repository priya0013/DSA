class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int arr:stones){
            pq.offer(arr);
        }
        while(pq.size()>1){
            int first=pq.poll();  //first largest
            int second=pq.poll();  //second largest
            if(first!=second){
                pq.offer(first-second);
            }

        }
        return pq.isEmpty()?0:pq.peek();
    }
}