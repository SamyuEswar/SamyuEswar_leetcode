class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        ArrayList<Character> a=new ArrayList<>();
        ArrayList<Character> b=new ArrayList<>();
        if (s == null || s.isEmpty()) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                a.add(s.charAt(i));
            }
        }
        for (int i = s.length()-1; i>=0;i--) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                b.add(s.charAt(i));
            }
        }
        boolean t=a.equals(b);
        return t;
    }
}