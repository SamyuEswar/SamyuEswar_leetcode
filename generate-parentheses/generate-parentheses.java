class Solution {
    void f(int open,int close,StringBuilder s,int n,List<String> ans){
        if(open==n && close==n){
            ans.add(s.toString());
            return ;
        }
        if(open<n){
            s.append('(');
            f(open+1,close,s,n,ans);
            s.deleteCharAt(s.length()-1); //backtrack
        }
        if(close<n && close<open){
            s.append(')');
            f(open,close+1,s,n,ans);
            s.deleteCharAt(s.length()-1); //backtrack
        }
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder s= new StringBuilder("");
        List<String> ans =new ArrayList<>();
        f(0,0,s,n,ans);
        return ans;
    }
}