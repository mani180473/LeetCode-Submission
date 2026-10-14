class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        ans = float('inf')
        n = len(nums)
        for i in range(n):
            l, r = i + 1, n-1

            while l < r:
                sum = nums[i] + nums[l] + nums[r]
                if abs(sum - target) < abs(ans - target):
                    ans = sum

                if sum < target:
                    l += 1
                elif sum > target:
                    r -= 1
                else:
                    return sum    

        return ans                              
