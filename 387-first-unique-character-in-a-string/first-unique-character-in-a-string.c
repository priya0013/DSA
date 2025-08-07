int firstUniqChar(char* s) {
        int cnt[26];
        for(int i=0;i<strlen(s);i++){
            cnt[s[i]-'a']++;
        }
        for(int i=0;i<strlen(s);i++){
            if(cnt[s[i]-'a']==1){
                return i;
            }
        }
        return -1;
    
}