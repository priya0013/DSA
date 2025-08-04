bool isAnagram(char* s, char* t) {
    int count[256]={0};
    if(strlen(s)!=strlen(t)){
        return false;
    }
    while(*s && *t){
        count[*s]++;
        count[*t]--;
        *s++;
        *t++;
    }
    for(int i=0;i<256;i++){
        if(count[i]!=0){
            return false;
        }
    }
    return true;


}