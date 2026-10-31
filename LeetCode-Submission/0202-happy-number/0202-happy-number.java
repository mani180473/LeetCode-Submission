class Solution {
    public static int computeSqr(int n){
        int sqSum =0;
        while(n != 0){
            int digit = n%10;
            sqSum += digit*digit;
            n /= 10; 
        }
        
        return sqSum;
    }
    public boolean isHappy(int n) {
       Set<Integer> seen = new HashSet<>();
       while(n!=1){
        if(seen.contains(n)) return false;

        seen.add(n);

        n = computeSqr(n);
       }
       
       return n == 1;

    }
}