import java.util.*;
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int cnt=0;
        for(int n:nums){
            cnt=Math.max(cnt,n);
        }
       
        int arr[]=new int[cnt+1];
        for(int i:nums){
            arr[i]++;
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<=cnt;i++){
            if(arr[i]==2){
                ans.add(i);
            }
        }
        int res[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;

 
    }
}