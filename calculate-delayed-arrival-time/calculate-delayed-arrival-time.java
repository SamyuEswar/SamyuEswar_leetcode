class Solution {
    public int findDelayedArrivalTime(int a, int d) {
        int t=a+d;
        if(t<24) return t;
        else if(t==24) return 0;
        else return t-24;
    }
}