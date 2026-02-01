class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
           ArrayList<Integer> l1 = new ArrayList<>();
           ArrayList<Integer> l2 = new ArrayList<>();
           int[] a=new int[2];
           int c1=0,c2=0;
           for(int x:nums1) l1.add(x);
           for(int x:nums2) l2.add(x);
           for(int x:l1) {
                if(l2.contains(x)) c1++;
            }
            for(int x:l2) {
                if(l1.contains(x)) c2++;
            }
            a[0]=c1;
            a[1]=c2;
            return a;
    }
}