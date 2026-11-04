class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }
        int cnt =0;
        int odd = 0;
        for(int n : hm.values()){
            if(n%2 == 0){
                cnt += n;
            }
            else{
                cnt += n - 1;
                odd = 1;
            }
        }

        return (odd == 1)? cnt+1 : cnt;
    }
}