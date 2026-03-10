class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double,Integer>h=new HashMap<>();
        long sum=0;
        for(var ele : rectangles){
            Double ratio=(double)ele[0]/ele[1];
            sum+=h.getOrDefault(ratio,0);
            h.put(ratio,h.getOrDefault(ratio,0)+1);
        }
        return sum;
    }
}