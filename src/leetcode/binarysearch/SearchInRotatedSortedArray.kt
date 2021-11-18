package leetcode.binarysearch

fun search(nums: IntArray, target: Int): Int {
    var l = 0
    var r = nums.size - 1

    while (l <= r) {

        var mid = (l + r) / 2
        if (target == nums[mid]) return mid
        if (nums[l] <= nums[mid]) {
            if (target > nums[mid] || target < nums[l]) l = mid + 1
            else r = mid - 1
        } else {
            if (target < nums[mid] || target > nums[r]) r = mid - 1
            else l = mid + 1
        }
    }


    return -1
}