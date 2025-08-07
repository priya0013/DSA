bool canConstruct(char* r, char* m) {
    int c[26]={0};
    for(int i=0;i<strlen(m);i++){
        c[m[i]-'a']++;
    }
    for(int i=0;i<strlen(r);i++){
       // c[m[i]-'a']--;
        if(--c[r[i]-'a']<0){
            return false;
        }
        
    }
    return true;
}