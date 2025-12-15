class Solution {
    public long getDescentPeriods(int[] prices) {
        long c=prices.length;
        long s=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]==prices[i]-1){
                s++;
                c+=s;
            }
            else{
                s=0;
            }
        }
        return c;
    }
}