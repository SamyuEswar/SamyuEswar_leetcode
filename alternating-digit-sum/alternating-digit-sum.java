class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        int temp=n,d=0;
        while(temp>0) {
            d++;
            temp/=10;
        }
        int s=(d%2==0)?-1:1;
        while(n>0){
            int r=n%10;
            sum+=r*s;
            s*=-1;
            n=n/10;
        }
        return sum;
    }
}