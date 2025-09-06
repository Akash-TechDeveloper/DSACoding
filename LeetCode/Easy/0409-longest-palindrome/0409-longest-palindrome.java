class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int length = 0;
        boolean oddFound = false;
        
        for (int freq : map.values()) {
            if (freq % 2 == 0) {
                length += freq;
            } else {
                length += freq - 1; 
                oddFound = true;
            }
        }
        if (oddFound) length += 1;
        
        return length;
    }
}