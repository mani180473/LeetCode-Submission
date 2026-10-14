class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        ans = [0] * len(nums)
        l, r = 0, len(nums)-1
        k = len(nums)-1
        while l <= r:
            l_sq = nums[l]**2
            r_sq = nums[r]**2
            if l_sq > r_sq:
                ans[k] = l_sq
                l += 1
            else:
                ans[k] = r_sq
                r -= 1
            k -= 1   

        return ans         

