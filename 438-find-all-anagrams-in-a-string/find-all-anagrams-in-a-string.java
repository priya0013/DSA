class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int sl=s.length();
        int pl=p.length();
        List<Integer> l=new ArrayList<>();
        if(sl<pl){
            return l;
        }
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<pl;i++){
            a[p.charAt(i)-'a']++;
            b[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(a,b)){
            l.add(0);
            
        }
        for(int i=pl;i<sl;i++){
            b[s.charAt(i-pl)-'a']--;
            b[s.charAt(i)-'a']++;
            if(Arrays.equals(a,b)){
                l.add(i-pl+1);
            }
        }
        return l;
    }
}