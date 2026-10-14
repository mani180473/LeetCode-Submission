class Solution:
    def minEatingSpeed(self, piles: List[int], hours: int) -> int:
        def can_eat(k):
            h_ans = 0
            for pile in piles:
                h_ans += pile // k
                if pile % k != 0:
                    h_ans += 1

            return h_ans <= hours          
        l = 1
        h = 0
        for pile in piles:
            h = max(h, pile)

        while l < h:
            mid = l + (h - l) // 2
            if can_eat(mid):
                h = mid  
            else:
                l = mid + 1
        return l  


