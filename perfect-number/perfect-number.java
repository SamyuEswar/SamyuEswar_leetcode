class Solution {
    public boolean checkPerfectNumber(int num) {
        ArrayList<Integer> n=new ArrayList<>();
        int s=0;
        for(int i=1;i<num;i++){
            if(num%i==0) n.add(i);
        }
        for(int a : n){
            s+=a;
        }
        if(s==num) return true;
        return false;
    }
}