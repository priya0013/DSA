int strStr(char* haystack, char* needle) {
    int a=strlen(haystack);
    int b=strlen(needle);
    int j;
    for(int i=0;i<=a-b;i++){
        for(j=0;j<b;j++){
            if(haystack[i+j]!=needle[j]){
                break;
            }
        }
        if(j==b){
            return i;
        }
    }
        return -1;
    
}