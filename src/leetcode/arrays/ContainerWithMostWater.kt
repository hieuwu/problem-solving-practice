package leetcode.arrays

fun maxArea(height: IntArray): Int {
    var left = 0
    var right = height.size - 1
    var maxArea = Integer.MIN_VALUE

    while (left < right) {
        var dist = right - left
        var area = Math.min(height[left], height[right]) * dist

        maxArea = Math.max(maxArea, area)

        if (height[left] < height[right]) {
            left++
        } else right--

    }
    return maxArea
}