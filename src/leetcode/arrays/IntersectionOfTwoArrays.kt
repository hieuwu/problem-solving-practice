package leetcode.arrays

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    var numMap = HashMap<Int, Int>()
    for (num in nums1) numMap[num] = numMap.getOrDefault(num, 0) + 1
    var res = mutableListOf<Int>()
    for (num in nums2) {
        if (numMap.containsKey(num) && numMap[num] != 0) {
            res.add(num)
            numMap[num] = numMap[num]!! - 1
        }
    }
    return res.toIntArray()
}