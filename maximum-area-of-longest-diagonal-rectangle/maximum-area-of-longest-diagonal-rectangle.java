class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        int ma=0,md=0;
        for(int i=0;i<d.length;i++){
            int p=d[i][0];
            int q=d[i][1];
            int di=p*p+q*q;
            int a=p*q;
            if(di>md) {
                md=di;
                ma=a;
            }
            else if(di==md){
                ma=Math.max(ma,a);
            }
        }
        return ma;
    }
}