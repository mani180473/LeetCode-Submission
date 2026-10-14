class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        win_sum = 0
        max_sum = float('-inf')
        l = 0

        for r in range(len(nums)):

            win_sum += nums[r]

            if r-l+1 > k:
                win_sum -= nums[l]
                l += 1
            if r-l+1 == k:
                max_sum = max(max_sum, win_sum)

        return max_sum/k            