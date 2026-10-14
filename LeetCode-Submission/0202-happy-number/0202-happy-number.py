class Solution:
    
    def sum_of_sqrs(self,n):
        sum=0
        while(n != 0):
            digit = n%10
            sum += digit*digit
            n //=10
        return sum    
    def isHappy(self, n: int) -> bool:
        s = n
        f = self.sum_of_sqrs(n)
        while s != f and f != 1:
            s = self.sum_of_sqrs(s)
            f = self.sum_of_sqrs(self.sum_of_sqrs(f))

        return f == 1        
        