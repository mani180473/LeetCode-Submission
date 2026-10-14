class Solution:
    def minSubArrayLen(self, k: int, nums: List[int]) -> int:
        min_len = float('inf')
        win_sum = 0
        l =0
        for r in range(len(nums)):
            win_sum += nums[r]

            while win_sum >= k:
                min_len = min(min_len, r - l + 1)

                win_sum -= nums[l]
                l += 1

           
        return 0 if min_len == float('inf') else min_len 
