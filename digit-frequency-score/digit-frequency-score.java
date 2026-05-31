class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> h=new HashMap<>();
        while(n>0){
            int r=n%10;
            h.put(r,h.getOrDefault(r,0)+1);
            n=n/10;
        }
        int s=0;
        for(int a:h.keySet()){
            s+=a*h.get(a);
        }
        return s;
    }
}