class Solution:
    def threeSum(self, nums):
        nums.sort()
        ans = []
        n = len(nums)
        for i in range(len(nums)):
            l = i+1
            r = n - 1
            #skip dup
            if i > 0 and nums[i] ==nums[i-1]:
                continue
            while(l<r):
                sum = nums[i] + nums[l] + nums[r]

                if sum == 0:
                    ans.append([nums[i], nums[l], nums[r]])
                    while l<r and nums[l] == nums[l+1]:
                        l += 1
                    while l<r and nums[r] == nums[r-1]:
                        r -= 1
                if sum < 0:
                    l += 1
                else:
                    r -= 1
        return ans                        