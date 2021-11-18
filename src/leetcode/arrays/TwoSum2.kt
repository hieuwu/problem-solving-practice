package leetcode.arrays

fun twoSum(numbers: IntArray, target: Int): IntArray {
    var left = 0
    var right = numbers.size - 1

    while (left < right) {
        var sum = numbers[left] + numbers[right]

        if (sum > target) {
            right--
        }
        if (sum < target) {
            left++
        }
        if (sum == target) return intArrayOf(left + 1, right + 1)

    }
    return intArrayOf()
}