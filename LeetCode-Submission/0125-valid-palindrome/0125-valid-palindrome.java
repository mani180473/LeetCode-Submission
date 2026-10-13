class Solution {
    public boolean isPalindrome(String s) {
        char ch[] =s.replaceAll("[^A-Za-z0-9]","").toLowerCase().toCharArray();
       
        int l = 0, r =ch.length-1;
        
        while(l <= r){
           if(ch[l] != ch[r]){
                return false;
           } 
                l++;
                r--;
        }
           return true;
    }
}