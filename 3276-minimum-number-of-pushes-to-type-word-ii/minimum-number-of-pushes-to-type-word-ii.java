class Solution {
    public int minimumPushes(String word) {
        Map<Character,Integer> freq=new HashMap<>();
        for(char c:word.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);

        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        pq.addAll(freq.values());
        int sum=0;
        int i=0;
        while(!pq.isEmpty()){
            sum+=(i/8+1)*pq.poll();
            i++;
        }
        return sum;
    }
}