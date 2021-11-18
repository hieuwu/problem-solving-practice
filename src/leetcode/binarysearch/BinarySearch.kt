package leetcode.binarysearch

fun binarySearch(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1
    while (left < right) {
        var mid = (right + left)/2
        if (target <= nums[mid]) right = mid
        else left = mid + 1
    }
    if (nums[left] == target) return left
    return - 1
}