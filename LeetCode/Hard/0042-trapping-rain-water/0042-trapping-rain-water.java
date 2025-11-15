class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[] stack = new int[n];
        int top = -1;int res = 0;
        for (int i = 0; i < n; i++) {
            while (top != -1 && height[i] > height[stack[top]]) {
                int bottom = stack[top--];
                if (top == -1) break;
                int left = stack[top];
                int width = i - left - 1;
                int boundedHeight = Math.min(height[left], height[i]) - height[bottom];
                res += width * boundedHeight;
            }
            stack[++top] = i;
        }

        return res;
    }
}
