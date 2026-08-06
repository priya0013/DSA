class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int r=0;
        int mx=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        while(r<fruits.length){
            mp.put(fruits[r],mp.getOrDefault(fruits[r],0)+1);
            while(mp.size()>2){
                int fru=fruits[l];
                mp.put(fru,mp.get(fru)-1);
                if(mp.get(fru)==0){
                    mp.remove(fru);
                }
                l++;
            }
            r++;
            mx=Math.max(mx,r-l);
        }
        return mx;
        
    }
}