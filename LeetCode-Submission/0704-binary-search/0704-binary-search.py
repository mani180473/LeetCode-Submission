class Solution:
    def search(self, a : List[int], target: int) -> int:
        l, h = 0, len(a) - 1 

        def Bsearch(a, target, l, h):
            if l > h: return -1

            mid = l + (h - l)//2
            if a[mid] == target:
                return mid

            elif a[mid] > target:
                return Bsearch(a, target, l, mid - 1)
            
            return Bsearch(a, target, mid + 1, h)

        return Bsearch(a, target, l, h)    

                