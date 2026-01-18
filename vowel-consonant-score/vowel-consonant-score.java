class Solution {
public int vowelConsonantScore(String s) {
        int v=0,c=0;
        char a1[]=s.toCharArray();
        for(char ch: a1){
            if(ch>='a' && ch<='z'){ 
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') v++;
                else c++;
            }
        }
        if (c==0) return 0;
        return v/c;
    }
};