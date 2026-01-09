class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int a=0;
        for(int i=0;i<stones.length();i++){
            char c=stones.charAt(i);
            for(int j=0;j<jewels.length();j++){
                if(jewels.charAt(j)==c) a++;
            }
        }
        return a;
    }
}