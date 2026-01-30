class Solution {
    public int largestSumAfterKNegations(int[] a, int k) {
        int n=a.length,s=0;
        Arrays.sort(a);
        for(int i=0;i<n && k>0;i++){
            if(a[i]<0){
                a[i]=-a[i];
                k--;
            }
        }
        Arrays.sort(a);
        if(k%2==1){
            a[0]=-a[0];
        }
        for(int z:a){
            s+=z;
        }
        return s;
    }
}