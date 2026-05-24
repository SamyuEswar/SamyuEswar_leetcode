class Solution {
    public int passwordStrength(String p) {
       HashSet<Character> h=new HashSet<>();
        int s=0;
        for(char c: p.toCharArray()){
            if(!h.contains(c)){
                h.add(c);
                if(c>='a' && c<='z') s+=1;
                else if(c>='A' && c<='Z') s+=2;
                else  if(c>='0' && c<='9') s+=3;
                else if(c=='!' || c=='@' || c=='#' || c=='$') s+=5;
            }
        }
        return s;
    }
}