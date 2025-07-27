class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ch=new int[26];
        for(char i:magazine.toCharArray()){
            ch[i-'a']++;
        }for(char i:ransomNote.toCharArray()){
            if(ch[i-'a']==0){
                return false;
            }
                ch[i-'a']--;
            
        }
        return true;
        
    }
}