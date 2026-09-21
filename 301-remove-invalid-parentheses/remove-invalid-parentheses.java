class Solution {
    public List<String> removeInvalidParentheses(String s) {
       List<String> l=new ArrayList<>();
       Queue<String> q=new LinkedList<>();
       HashSet<String> set=new HashSet<>();
       q.add(s);
       set.add(s);
       boolean found=false;
       while(!q.isEmpty()){
        int n=q.size();
        while(n-->0){
            String cur=q.poll();
            if(isvalid(cur)){
                l.add(cur);
                found=true;
                continue;
            }
            for(int i=0;i<cur.length();i++){
                if(cur.charAt(i)!='('&& cur.charAt(i)!=')'){
                    continue;
                }
                String next=cur.substring(0,i)+cur.substring(i+1);
                if(set.add(next)){
                    q.add(next);
                }
            }
        }
        if(found){
            break;
        }
       } 
       return l;
    }
    public static boolean isvalid(String s){
        int bal=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                bal++;
            }else if(c==')'){
                bal--;
            }
            if(bal<0){
                return false;
            }
        }
        return bal==0;
    }
}