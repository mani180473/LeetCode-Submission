class Solution:
    def searchRange(self, a: List[int], target: int) -> List[int]:
        def frst_pos(a, target):
            l , h = 0, len(a)-1
            frst = -1
            while l <= h:
                mid = l + (h - l) // 2

                if a[mid] == target:
                    frst = mid
                    h = mid - 1

                elif a[mid] > target:
                    h = mid - 1

                else:

                    l = mid + 1

            return frst 

        def last_pos(a, target):
            l , h = 0, len(a)-1
            last = -1
            while l <= h:
                mid = l + (h - l) // 2

                if a[mid] == target:
                    last = mid
                    l = mid + 1

                elif a[mid] > target:
                    h = mid - 1

                else:

                    l = mid + 1

            return last  
        return [frst_pos(a, target), last_pos(a, target)]

