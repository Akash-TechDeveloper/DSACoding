class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> st = new ArrayDeque<>();
        int max=0;
        int hs=heights.length;
        for(int i=0;i<=hs;i++){
            int crrheight = (i == hs) ? 0 : heights[i];
            while(!st.isEmpty()&&crrheight<heights[st.peek()]){
                int height=heights[st.pop()];
                int width=st.isEmpty() ? i : i-st.peek()-1;
                int area=height*width;
                max=Math.max(max,area);
            }
            st.push(i);
        }
        return max;
    }
}