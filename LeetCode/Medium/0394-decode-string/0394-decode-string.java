class Solution {
    public String decodeString(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        Stack<StringBuilder> ssb = new Stack<>();
        int x = 0;
        for( char ch : s.toCharArray()){
            if(Character.isDigit(ch))  x = x*10 +(ch-'0');
            else if (ch =='['){
                st.push(x);
                x = 0;
                ssb.push(sb);
                sb = new StringBuilder();
            } else if (ch == ']') {
                int k = st.pop();
                StringBuilder temp = sb;
                sb = ssb.pop();
                while (k-- > 0) {
                    sb.append(temp);
                }
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}