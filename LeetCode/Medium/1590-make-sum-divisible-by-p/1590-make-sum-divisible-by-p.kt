class Solution {
    fun minSubarray(
        nums: IntArray,
        p: Int,
    ): Int {
        val arraySum = nums.sumOf(Int::toLong)
        val subarrayRem = (arraySum % p).toInt()
        if (subarrayRem == 0) {
            return 0
        }
        val maxPrefix = hashMapOf(0 to -1)
        var prefixRem = 0
        var result = nums.size

        for (i in nums.indices) {
            prefixRem = (prefixRem + nums[i]) % p
            val complement = (prefixRem - subarrayRem).mod(p)

            maxPrefix[complement]?.let {
                result = minOf(result, i - it)
            }
            maxPrefix[prefixRem] = i
        }
        return if (result < nums.size) result else -1
    }
}