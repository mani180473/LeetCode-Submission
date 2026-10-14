class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        max_len = max_char = 0
        freq = {}
        l = 0 
        for r in range(len(s)):
            freq[s[r]] = freq.get(s[r], 0) + 1
            
            max_char = max(max_char, freq[s[r]])
            while (r - l + 1) - max_char > k:
                freq[s[l]] -= 1
                l += 1

            max_len = max(max_len, r - l + 1)   

        return max_len     



        