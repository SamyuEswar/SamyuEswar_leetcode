class Solution {
    public int calPoints(String[] o) {
        Stack<Integer> s=new Stack<>();
        int z=0;
        for(int i=0;i<o.length;i++){
            if(o[i].equals("C")) {
                s.pop();
            }
            else if(o[i].equals("D")){
                s.push(s.peek()*2);
            }
            else if(o[i].equals("+")){
                int a=s.pop();
                int b=s.peek();
                int c=a+b;
                s.push(a);
                s.push(c);
            }
            else {
                s.push(Integer.parseInt(o[i]));
            }
        }
        while(!s.isEmpty()){
            z+=s.pop();
        }
        return z;
    }
}