class Solution {
    public int kItemsWithMaximumSum(int o,int z,int n,int k) {
        int s=0;
        if(k<=o) return k;
        if(k<=o+z) return o;
        return o-(k-o-z);
    }
}