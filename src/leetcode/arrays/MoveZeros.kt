package leetcode.arrays

fun moveZeroes(nums: IntArray): Unit {
    var pos = 0

    for (num in nums) {
        if (num != 0) {
            nums[pos] = num
            pos++
        }
    }

    while (pos < nums.size) {
        nums[pos] = 0
        pos++
    }
}