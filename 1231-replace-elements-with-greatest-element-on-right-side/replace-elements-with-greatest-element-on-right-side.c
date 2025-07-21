/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* replaceElements(int* arr, int arrSize, int* returnSize) {
    *returnSize=arrSize;
    int high=-1;
        for(int i=arrSize-1;i>=0;i--){
            if(arr[i]>high){
                int t=arr[i];
                arr[i]=high;
                high=t;
            }else{
                arr[i]=high;
            }
        }
        return arr;
}