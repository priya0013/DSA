class Solution {
    public int hIndex(int[] citations) {
        int h_i=0;
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
            if(citations[i]>=(citations.length-i)){
            h_i=(citations.length-i);
            break;
            }
        }
        return h_i;
    }
}