class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
         for (int num : nums) {
            int current = num;
            while (!stack.isEmpty()) {
                int top = stack.peek();
                int g = gcd(top, current);
                if (g == 1) break;
                current = (int)((long)stack.pop()*current/ g);
            }

            stack.push(current);
        }

        List<Integer> list= new ArrayList<>();
        for(int x : stack) list.add(x);
         Collections.reverse(list);
         return list;
    }
    private int gcd(int n,int m){
        if(n<m) return gcd(m,n);
        if(m==0) return n;
        return gcd(m,n%m);
    } 
   
}