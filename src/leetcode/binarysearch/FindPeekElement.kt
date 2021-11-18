package leetcode.binarysearch

fun findPeakElement(nums: IntArray): Int {
    var left = 0
    var right = nums.size - 1

    while (left < right) {
        var mid = (left + right + 1)/2
        if (nums[mid - 1] > nums[mid]) right = mid - 1
        else left = mid

    }
    return left

}