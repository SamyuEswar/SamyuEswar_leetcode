class Solution {
    public int smallestEvenMultiple(int n) {
        int a=0;
        if(n%2==1) a=2*n;
        else a=n;
        return a; 
    }
}