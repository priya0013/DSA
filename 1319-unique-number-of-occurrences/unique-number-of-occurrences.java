class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int n:arr)
            m.put(n,m.getOrDefault(n,0)+1);
        Set<Integer> s=new HashSet<>(m.values());
        return m.size()==s.size();
        
    }
}