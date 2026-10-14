# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        s = f = head
        if head is None or head.next is None:
            return None

        while f is not None and f.next is not None:
            s = s.next
            f = f.next.next
            if s == f:   
                f = head 
                while s != f:
                    s = s.next
                    f = f.next
                return s      