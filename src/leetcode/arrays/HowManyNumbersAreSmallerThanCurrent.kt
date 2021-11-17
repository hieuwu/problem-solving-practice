package leetcode.arrays
//This technique is based on counting sort
fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    var res = Array(nums.size){0}
    var count = Array(101){0}

    for (item in nums) {
        count[item] += 1
    }

    for (i in 1..100) {
        count[i] += count[i - 1]
    }

    for (i in nums.indices) {
        if (nums[i] == 0) res[i] = 0
        else res[i] = count[nums[i] - 1]
    }

    return res.toIntArray()
}