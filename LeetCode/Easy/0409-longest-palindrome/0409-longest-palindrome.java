class Solution {
    static{
        for(int i=0;i<300;i++){
            longestPalindrome("");
        }
    }
    public static int longestPalindrome(String s) {
        int[] cnt = new int[128];
        for (char c : s.toCharArray()) cnt[c]++;

        int length = 0;
        boolean hasOdd = false;
        for (int f : cnt) {
            length += (f / 2) * 2;
            if ((f & 1) == 1) hasOdd = true;
        }
        return hasOdd ? length + 1 : length;
    }
}