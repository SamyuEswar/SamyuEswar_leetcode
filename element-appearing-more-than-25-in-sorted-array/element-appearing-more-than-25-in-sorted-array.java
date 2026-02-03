class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int p=n/4,o=1;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]) o++;
            else o=1;
            if(o>p) return arr[i];
        }
        return arr[0];
    }
}