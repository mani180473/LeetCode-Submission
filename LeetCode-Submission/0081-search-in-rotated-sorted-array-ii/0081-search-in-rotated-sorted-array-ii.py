class Solution:
    def search(self, a: List[int], target: int) -> bool:
        l, h = 0, len(a) - 1
        
        while l <= h:
            mid = l + (h - l) // 2

            if a[mid] == target:
                return True
                
            if a[mid] == a[l]:
                l += 1
                continue    

            if a[l] <= a[mid]:
                if a[l] <= target < a[mid]:
                    h =  mid - 1 
                else:
                    l = mid + 1
            else:
                if a[mid] < target <= a[h]:
                    l = mid + 1
                else:
                    h = mid - 1

        return False                           