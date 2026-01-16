class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> n=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int a=i;
            while(a>0){
                int r=a%10;
                if(r==0 || i%r!=0) break;
                a=a/10;
            }
            if(a==0){
                n.add(i);
            }
        }
        return n;
    }
}