class Solution {
    public boolean lemonadeChange(int[] b) {
        int c=0,t=0;
        for(int i=0;i<b.length;i++){
            if(b[i]==5) c++;
            else if(b[i]==10) {
                if(c==0) return false;
                else{
                    c--;
                    t++;
                }
            }
            else if(b[i]==20){
                if(t>0 && c>0 ) { //greedy method
                    t--;
                    c--;
                }
                else if(c>=3){
                    c-=3;
                }
                else return false;
            }
        }
        return true;
    }
}