package leetcode.arrays

fun buildArray(nums: IntArray): IntArray {
    var res = Array(nums.size){0}

    for (i in nums.indices) {
        res[i] = nums[nums[i]]
    }


    return res.toIntArray()
}