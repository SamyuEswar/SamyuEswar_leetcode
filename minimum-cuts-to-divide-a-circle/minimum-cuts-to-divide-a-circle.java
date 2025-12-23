class Solution {
    public int numberOfCuts(int n) {
        int a=0;
        if(n==1) a=0;
        else if(n%2==0) a=n/2;
        else a=n;
        return a;
    }
}