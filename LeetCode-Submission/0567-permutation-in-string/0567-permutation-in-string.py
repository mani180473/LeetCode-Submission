class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        m, n = len(s1), len(s2)
        s1_c ,s2_c = [0]*26, [0]*26

        if m > n:
            return False 
            
        for ch in s1:
            s1_c[ord(ch) - ord('a')] += 1

        for ch in s2[:m]:
            s2_c[ord(ch) - ord('a')] += 1

        if s1_c == s2_c:
            return True

        for i in range(m, n):
            s2_c[ord(s2[i]) - ord('a')] += 1    #add incoming
            s2_c[ord(s2[i - m]) - ord('a')] -= 1 #remove outgoing

            if s1_c == s2_c:
                return True


        return False    
