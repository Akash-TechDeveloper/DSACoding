// class Solution:
//     def isPerfectSquare(self, num: int) -> bool:
//         if num < 0:
//             return False
//         if num == 0 or num == 1:
//             return True
        
//         left, right = 1, num
//         while left <= right:
//             mid = (left + right) // 2
//             if mid > num / mid:
//                 right = mid - 1
//             elif mid * mid == num:
//                 return True
//             else:  # mid * mid < num
//                 left = mid + 1
//         return False
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<0) return false;
        if (num==0||num==1) return true;
        long left=1;long right=num;
        while(left<right){
            long mid = left+(right-left)/2;
              if (mid == num / mid && num % mid == 0) {
                return true;
            } else if (mid > num / mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}