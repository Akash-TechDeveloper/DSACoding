class Solution {
    public int[] canSeePersonsCount(int[] height) {
        int a=height.length;
        int arr[]=new int[a];
         Deque<Integer> st = new LinkedList<>();
        for(int i=0;i<a;i++){
            while(!st.isEmpty()&&height[st.peek()]<=height[i]){
                arr[st.pop()]++;
            }
            if(!st.isEmpty())
                arr[st.peek()]++;
                st.push(i);
        }
        return arr;
    }
}