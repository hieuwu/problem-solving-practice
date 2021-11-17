package leetcode.arrays

fun canJump(nums: IntArray): Boolean {
    if (nums.isEmpty()) return false
    if (nums.size == 1 && nums[0] == 1) return true
    if (nums.size == 1 && nums[0] == 0) return true

    var i = 0
    var dis = 0
    while (i <= dis) {
        dis = Math.max(dis, i + nums[i])
        if (dis >= nums.size - 1) return true

        i++
    }
    return false
}