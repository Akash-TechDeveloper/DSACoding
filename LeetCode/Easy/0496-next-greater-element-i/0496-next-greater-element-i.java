class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=nums2.length-1;
        while(i>=0)
        {
            if(st.isEmpty())
            {
                map.put(nums2[i],-1);
                st.push(nums2[i]);
            }
            else{
                if(st.peek()>nums2[i])
                {
                    map.put(nums2[i],st.peek());
                    st.push(nums2[i]);
                }
                else{
                    while(!st.isEmpty() && nums2[i]>st.peek())
                    {
                        st.pop();
                    }
                    if(st.isEmpty())
                    {
                        map.put(nums2[i],-1);
                        st.push(nums2[i]);
                    }
                    else{
                        map.put(nums2[i],st.peek());
                        st.push(nums2[i]);
                    }
                }
            }
            i--;
        }
        int[] ans=new int[nums1.length];
        for(int j=0;j<nums1.length;j++)
        {
            ans[j]=map.get(nums1[j]);
        }
        return ans;
    }
}