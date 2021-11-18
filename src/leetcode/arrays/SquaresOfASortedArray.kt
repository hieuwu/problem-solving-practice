package leetcode.arrays

fun sortedSquares(nums: IntArray): IntArray {
    var left = 0
    var right = nums.size - 1
    var lastPos = nums.size - 1
    var squareArr = Array(nums.size){0}
    while (left <= right) {
        if (nums[right] * nums[right] > nums[left] * nums[left]) {
            squareArr[lastPos] = nums[right] * nums[right]
            right--
        }
        else {
            squareArr[lastPos] = nums[left] * nums[left]
            left++

        }
        lastPos--

    }
    return squareArr.toIntArray()
}