class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        int a=m.length,b=m[0].length;
        int l=0,h=a-1,row=0;
        while(l<=h){
            int mid=(l+h)/2;
            if(m[mid][0]<=t && m[mid][b-1]>=t) {
                row=mid;
                break;
            }
            else if(m[mid][0]>t){
                h=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        l=0;
        h=b-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(m[row][mid]==t) return true;
            else if(m[row][mid]>t) h=mid-1;
            else l=mid+1; 
        }
        return false;
    }
}