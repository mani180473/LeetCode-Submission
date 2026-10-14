class Solution:
    def reversePrefix(self, s: str, k: int) -> str:
        l = 0
        li = list(s)
        r = k-1
        while l < r:
            li[l], li[r] = li[r], li[l]
            l +=1
            r -=1
        return ''.join(li)    
        