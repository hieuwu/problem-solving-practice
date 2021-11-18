package leetcode.arrays

import common.quickSort

fun threeSum(nums: IntArray): List<List<Int>> {
    var res = mutableListOf<MutableList<Int>>()
    if (nums.isEmpty()) return res

    quickSort(nums, 0, nums.size - 1)

    for (i in nums.indices) {
        if (i > 0 && nums[i] == nums[i - 1]) continue

        var left = i + 1
        var right = nums.size - 1

        while (left < right) {
            var sum = nums[i] + nums[left] + nums[right]
            if (sum > 0) right--
            else if (sum < 0) left++
            else {
                res.add(mutableListOf(nums[i], nums[left], nums[right]))
                left++
                while (nums[left] == nums[left - 1] && left < right) left++
            }
        }
    }
    return res
}