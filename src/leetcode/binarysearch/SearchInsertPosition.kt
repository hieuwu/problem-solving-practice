package leetcode.arrays

fun searchInsert(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1

    while (left < right) {
        var mid = (left + right) / 2
        if (target > nums[mid]) left = mid + 1
        else right = mid
    }
    if (target > nums[right]) return right + 1
    return left
}