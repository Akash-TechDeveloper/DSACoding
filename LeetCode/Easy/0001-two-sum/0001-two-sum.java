class Solution {
    public int[] twoSum(int[] a, int t) {
        var m = new java.util.HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            if (m.containsKey(t - a[i])) 
                return new int[] { m.get(t - a[i]), i };
            m.put(a[i], i);
        }
        return null;
    }
}