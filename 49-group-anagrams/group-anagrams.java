class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String w:strs){
            char[] c=w.toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            if(!mp.containsKey(s)){
                mp.put(s,new ArrayList<>());
            }
            mp.get(s).add(w);
        }
        return new ArrayList<>(mp.values());
    }
}