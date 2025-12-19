class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        w=s.split();
        if not w:
            return 0;
        return len(w[-1]);