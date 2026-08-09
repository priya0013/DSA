class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int j=0;
        //enga frequency find panra
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int ans[]=new int[k];
        // upto k length vara than allowed pananu
        while(j<k){
            int max=-1;
            int ele=0;
            //key oda value athavathu key na->array element value ->how many times repeated that element a=1,2,3
            for(int a:mp.keySet()){
                //mp.get(a) element oda frequency 1->3time,2->2times vachu max kandupudi
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