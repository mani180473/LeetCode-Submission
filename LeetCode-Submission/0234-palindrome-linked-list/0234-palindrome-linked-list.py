# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverse(self, head):
        cur = head
        prev =None
        while cur:
            next_node = cur.next
            cur.next = prev
            prev = cur
            cur = next_node

        return prev    
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        s = f= head
        while f and f.next:
            s = s.next
            f = f.next.next

        rev = self.reverse(s)
        while rev:
            if head.val != rev.val:
                return False
            head = head.next
            rev = rev.next
        return True            
        