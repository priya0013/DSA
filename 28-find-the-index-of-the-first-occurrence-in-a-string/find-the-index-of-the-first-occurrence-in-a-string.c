int strStr(char* haystack, char* needle) {
    int n=strlen(haystack);
    int m=strlen(needle);
    int j;
    for(int i=0;i<=n-m;i++){
        for(j=0;j<m;j++){
            if(haystack[i+j]!=needle[j]){
                break;
            }
        }
        if(j==m){
            return i;
        
        }
    }
        return -1;
    
}