class Solution {
    public boolean isPerfectSquare(int num) {
        int r = (int) Math.sqrt(num);
        return r*r==num;
    }
}