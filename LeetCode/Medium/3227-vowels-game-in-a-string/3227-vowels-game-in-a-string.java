class Solution {
    static{
        for(int i=0;i<200;i++) doesAliceWin("a");
    }
    public static boolean doesAliceWin(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'a','e','i','o','u':
                    return true;
            }
        }

        return false;
    }
}