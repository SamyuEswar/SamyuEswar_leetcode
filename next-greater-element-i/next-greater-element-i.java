class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty()&& nums2[i]>st.peek()){
                h.put(st.pop(),nums2[i]);
            }
            st.push(nums2[i]);
        }
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=h.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}