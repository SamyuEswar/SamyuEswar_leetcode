class Solution {
    public int totalFruit(int[] f) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int l=0,ml=0;
        for(int r=0;r<f.length;r++){
            h.put(f[r],h.getOrDefault(f[r],0)+1);
            while(h.size()>2){
                h.put(f[l],h.get(f[l])-1);
                if(h.get(f[l])==0) h.remove(f[l]);
                l++;
            }
            ml=Math.max(ml,r-l+1);
        }
        return ml;
    }
}