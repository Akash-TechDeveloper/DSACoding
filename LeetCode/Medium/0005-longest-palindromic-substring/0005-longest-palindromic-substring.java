class Solution {
    public String longestPalindrome(String s) {
        int st = 0;
        int end = 0;
        for(int i=0;i<s.length();i++){
            int len1 = middle(s,i,i);
            int len2 = middle(s,i,i+1);
            int max = Math.max(len1,len2);

            if(max>end-st){
                st = i-(max-1)/2;
                end = i+max/2;
            }
        }
        return s.substring(st,end+1);
    }
    private static int middle(String s, int st, int end){
        while(st>=0 && end<s.length() && s.charAt(st) == s.charAt(end)){
            st--;
            end++;
        }
        return end-st-1;
    }
}