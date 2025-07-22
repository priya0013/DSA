class Solution {
    public boolean detectCapitalUse(String s) {
        boolean flag=false;
        if(s.equals(s.toUpperCase())){
            flag=true;
        }else if(s.equals(s.toLowerCase())){
            flag=true;
        }else if(Character.isUpperCase(s.charAt(0)) && s.substring(1).equals(s.substring(1).toLowerCase())){
            flag=true;
        }
        return flag;
        
    }
}