int lengthOfLastWord(char* s) {
    int i=strlen(s)-1;
    int length_count=0;
    while(i>=0 && s[i]==' '){
        i--;
    }
    while(i>=0 && s[i]!=' '){
        length_count++;
        i--;
    }
    return length_count;
    
}