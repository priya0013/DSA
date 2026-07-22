class Solution {

    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int l=0;
        int max=0;
        int r=0;
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
            max=Math.max(max,r-l);
        }
        return max;
    }
}