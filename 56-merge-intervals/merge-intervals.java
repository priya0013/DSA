class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int a[][]=new int[arr.length][2];
        int start=arr[0][0];
        int end=arr[0][1];
        int k=0;
        for(int i=1;i<arr.length;i++){
            if(end>=arr[i][0]){
                end=Math.max(end,arr[i][1]);
            }else{
                a[k][0]=start;
                a[k][1]=end;
                k++;
                start=arr[i][0];
                end=arr[i][1];
                
                
            }

        }
        a[k][0]=start;
        a[k][1]=end;
        k++;
        return Arrays.copyOf(a,k);

    }
}