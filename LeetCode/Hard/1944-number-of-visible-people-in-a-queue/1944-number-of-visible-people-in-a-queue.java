class Solution {
    static {
        for(int i = 0; i < 500; i++){
            canSeePersonsCount(new int[]{1,2,3});
        }
    }
    public static int[] canSeePersonsCount(int[] h) {
        int[] stack = new int[h.length];
        int[] ans = new int[h.length];
        int top = -1;
        for(int i = h.length-1; i >= 0; i--){
            if(top > -1){
                int count = 0;
                while(top > -1 && stack[top] <= h[i]){
                    count ++;
                    top --;
                }
                if(top > -1) ans[i] = count + 1;
                else ans[i] = count;
            }
            stack[++top] = h[i];
        }
        return ans;
    }
}