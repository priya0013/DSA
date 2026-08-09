class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int ans[]=new int[k];
        while(j<k){
            int max=-1;
            int ele=0;
            for(int a:mp.keySet()){
                if(mp.get(a)>max){
                    max=mp.get(a);
                    ele=a;
                }
            }
            ans[j]=ele;
            j++;
            mp.remove(ele);
        }
        return ans;
    }
}