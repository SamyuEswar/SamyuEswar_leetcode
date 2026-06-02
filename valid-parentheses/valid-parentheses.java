class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char a:s.toCharArray()){
            if(a=='(' || a=='{' || a=='[') st.push(a);
            else if(a==')' || a=='}' || a==']'){
                if(st.isEmpty()) return false;
                char q=st.peek();
                if(a==')' && q!='(' || a=='}' && q!='{' || a==']' && q!='[') return false;
                st.pop();
            }
        }
        if(st.isEmpty()) return true;
        else return false;
    }
}