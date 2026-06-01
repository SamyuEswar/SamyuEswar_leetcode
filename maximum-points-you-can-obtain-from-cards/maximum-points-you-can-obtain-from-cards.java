class Solution {
    public int maxScore(int[] p, int k) {
        int s=0;
        for(int i=0;i<k;i++){
            s+=p[i];
        }
        int m=s,l=k-1,r=p.length-1;
        while(l>=0){
            s-=p[l];
            l--;
            s+=p[r];
            r--;
            m=Math.max(m,s);
        }
        return m;
    }
}