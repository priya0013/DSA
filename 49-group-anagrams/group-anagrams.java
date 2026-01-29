class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> mp=new HashMap<>();
        for(String s:strs){
            char []c=s.toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            mp.putIfAbsent(key,new ArrayList<>());
            mp.get(key).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}