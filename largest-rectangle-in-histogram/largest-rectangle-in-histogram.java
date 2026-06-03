class Solution {
    public int largestRectangleArea(int[] h) {
        int n=h.length;
        int[] nse =new int[n];
        Stack<Integer> st=new Stack<>();
        // Finding next smaller element
        for(int i=n-1;i>=0;i--){
            int c=h[i];
            while(!st.isEmpty() && h[st.peek()]>=c){
                st.pop();
            }
            if(st.isEmpty()) nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        // Finding previous smaller element
        int[] pse=new int[n];
        st.clear();
        for(int i=0;i<n;i++){
            int c=h[i];
            while(!st.isEmpty() && h[st.peek()]>=c){
                st.pop();
            }
            if(st.isEmpty()) pse[i]=0;
            else pse[i]=st.peek()+1;
            st.push(i);
        }
        // Finding the area
        int m=0;
        for(int i=0;i<n;i++){
            int a=h[i]*(nse[i]-pse[i]);
            if(a>m) m=a;
        }
        return m;
    }
}