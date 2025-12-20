class Solution {
    public int minDeletionSize(String[] strs) {
        int n1=strs.length;
        int n2=strs[0].length();
        int d=0;
        for(int i=0;i<n2;i++){
            for(int j=1;j<n1;j++){
                if(strs[j].charAt(i)<strs[j-1].charAt(i)){
                    d++;
                    break;
                }
            }
        }
        return d;
    }
}