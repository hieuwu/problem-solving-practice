package leetcode.arrays

fun maxSubArray(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    if (nums.size == 1) return nums[0]

    var currentMax = nums[0]
    var globalMax = nums[0]
    for (i in 1 until nums.size) {
        currentMax = Math.max(nums[i], nums[i] + currentMax)
        if (currentMax > globalMax) globalMax = currentMax
    }
    return globalMax
}