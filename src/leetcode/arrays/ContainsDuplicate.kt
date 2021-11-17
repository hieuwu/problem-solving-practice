package leetcode.arrays

fun containsDuplicate(nums: IntArray): Boolean {
    var map = HashMap<Int, Int>()
    for (num in nums) {
        if (map.containsKey(num)) return true
        else map[num] = 1
    }
    return false
}