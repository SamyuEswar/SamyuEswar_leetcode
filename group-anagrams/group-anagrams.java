class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String str:strs){
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        String ns=new String(ch);
        if(hm.containsKey(ns)){
            hm.get(ns).add(str);
        }
        else{
            List<String>l=new ArrayList<>();
            l.add(str);
            hm.put(ns,l);
        }
        }
        return new ArrayList<>(hm.values());
    }
}