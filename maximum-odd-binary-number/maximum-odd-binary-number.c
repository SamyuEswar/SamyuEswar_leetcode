char* maximumOddBinaryNumber(char* s) {
    int ones=0;
    for(int i=0;s[i]!='\0';i++){
        if(s[i]=='1') ones++;
    }
    for(int i=0;i<ones-1;i++) s[i]='1';
    for(int i=ones-1;s[i];i++) s[i]='0';
    s[strlen(s)-1]='1';
    return s;
}