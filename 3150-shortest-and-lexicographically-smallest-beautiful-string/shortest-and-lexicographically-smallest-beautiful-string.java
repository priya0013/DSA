class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                arr.add(i);
            }
        }
        if(arr.size()<k){
            return "";
        }
        String ans="";
        for(int i=0;i+k-1<arr.size();i++){
            int start=arr.get(i);
            int end=arr.get(i+k-1);
            String cur=s.substring(start,end+1);
            if(ans.equals("") || cur.length()<ans.length()){
                ans=cur;

                //it compare the letter lexi order
            }else if(cur.length()==ans.length() && cur.compareTo(ans)<0){
                ans=cur;
            }
        }
        return ans;
    }
}