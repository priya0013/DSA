class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        int freq[]=new int[n+1];
        for(int x:nums){
            freq[x]++;
        }
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(freq[i]==2){
                l.add(i);
            }
        }
        return l;
    }
}