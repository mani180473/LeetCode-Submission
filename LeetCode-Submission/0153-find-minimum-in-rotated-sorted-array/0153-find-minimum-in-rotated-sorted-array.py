class Solution:
    def findMin(self, a: List[int]) -> int:
        l , h = 0, len(a) - 1
        
        while l < h:
            mid = l + (h - l) // 2

            if a[mid] > a[h]:
                l = mid + 1
            else:
                
                h = mid
                

        return a[l]       

