class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int t=0;
        int b=arr.length-1;
        int l=0;
        int r=arr[0].length-1;
        List<Integer> li=new ArrayList<>();
        while(l<=r && t<=b){
            for(int i=l;i<=r;i++){
                li.add(arr[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++){
                li.add(arr[i][r]);
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    li.add(arr[b][i]);
                }
                b--;

            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                    li.add(arr[i][l]);
                }
                l++;
            }
        }
        return li;
    }
}