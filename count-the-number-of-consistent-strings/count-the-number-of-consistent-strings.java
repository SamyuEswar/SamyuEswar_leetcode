class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c = 0;
        boolean[] a = new boolean[26];
        for (char ch : allowed.toCharArray()) {
            a[ch - 'a'] = true;
        }
        for (String w : words) {
            boolean ok = true;   
            for (char ch : w.toCharArray()) {
                if (!a[ch - 'a']) {
                    ok = false;
                    break;
                }
            }
            if (ok) c++;
        }
        return c;
    }
}