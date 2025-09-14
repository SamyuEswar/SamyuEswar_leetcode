char findTheDifference(char* s, char* t) {
    int a[26]={0};
    for(int i=0;s[i];i++) a[s[i]-'a']++;
    for(int j=0;t[j];j++){
        a[t[j]-'a']--;
        if(a[t[j]-'a']<0) return t[j];
    }
    return ' ';
}