class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>h=new HashMap<>();
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        int i=0,sm=0;
        while(i<s.length()){
            if(i+1<s.length() && h.get(s.charAt(i))<h.get(s.charAt(i+1))){
                sm+=h.get(s.charAt(i+1))-h.get(s.charAt(i));
                i++;
            }
            else {
                sm+=h.get(s.charAt(i));
            }
            i++;
        }
        return sm;
    }
}