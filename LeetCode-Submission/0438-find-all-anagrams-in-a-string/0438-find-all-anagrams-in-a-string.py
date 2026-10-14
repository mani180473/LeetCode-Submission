class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        n, m = len(p), len(s)
        ans = []

        if n > m:
            return ans

        p_c = [0] * 26
        for ch in p:
            p_c[ord(ch) - ord('a')] += 1

        s_c = [0] * 26
        for st in s[:n]:
            s_c[ord(st) - ord('a')] += 1

        #First window
        if s_c == p_c:
            ans.append(0)

        for i in range(n, m):
            s_c[ord(s[i]) - ord('a')] += 1  # add incoming
            s_c[ord(s[i-n]) - ord('a')] -= 1  #remove outgoing         
            
            if s_c == p_c:
                ans.append(i - n + 1)
        return ans        
