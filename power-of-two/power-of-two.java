class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean a= false;
        for(int i=0;i<31;i++){
            if(Math.pow(2,i)==n) return true;
            else if(Math.pow(2,i)>n || n%2!=0) return false;
        }
        return false;
    }
}