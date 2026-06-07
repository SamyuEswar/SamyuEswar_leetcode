class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> a= new ArrayList<>();
        bstring(0,n,k,0,"",a);
        return a;
    }
    public void bstring(int i,int n,int k,int cost,String s,List<String> a){
        if(cost>k) return ;
        if(i==n){
            a.add(s);
            return ;
        }
        bstring(i+1,n,k,cost,s+"0",a);
        if(i==0 || s.charAt(i-1)!='1'){
            bstring(i+1,n,k,cost+i,s+"1",a);
        }
    }
}