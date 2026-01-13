class Solution {
    public boolean isPalindrome(int x) {
        int n=x,m=0;
        while(x>0){
            int r=x%10;
            m=m*10+r;
            x=x/10;
        }
        if(m==n) return true;
        else return false;
    }
}