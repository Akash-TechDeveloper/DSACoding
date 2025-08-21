class Solution {
    public int longestValidParentheses(String s) {
        Deque<Integer> st =new LinkedList<>();
        st.push(-1);
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i); //0 
            }
            else {
                st.pop(); //1
                if(st.isEmpty()) {
                    st.push(i);
                }
                else{
                    max=Math.max(max,i-st.peek()); //2-0=2
                }
            }
        }
        return max;
    }
}