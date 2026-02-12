class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res=new ArrayList<>();
        Arrays.sort(words,(a,b)->a.length()-b.length());
        int n=words.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(words[j].contains(words[i])){
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
    }
}