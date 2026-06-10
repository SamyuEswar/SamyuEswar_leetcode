class Solution {
    public void f(int i,int t,List<Integer> temp ,int[] can,List<List<Integer>> ans){
        if(i==can.length){
            if(t==0) ans.add(new ArrayList<>(temp));
            return;
        }
        f(i+1,t,temp,can,ans);
        if(can[i]<=t){
            temp.add(can[i]);
            f(i,t-can[i],temp,can,ans);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] can, int t) {
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        f(0,t,temp,can,ans);
        return ans;
    }
}