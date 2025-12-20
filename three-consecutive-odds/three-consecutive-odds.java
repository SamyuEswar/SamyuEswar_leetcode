class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n=arr.length;
        int a=0;
        boolean b=false;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                a++;
                if(a==3) {
                    return true;
                }
            }
            else a=0;
        }
        return false;
    }
}