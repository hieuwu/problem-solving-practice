package leetcode.arrays

fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    if (matrix == null) return false

    var rows = matrix.size
    var cols = matrix[0].size

    var start = 0
    var end = rows * cols - 1

    while (start <= end) {
        var mid = (start + end) / 2
        if (matrix[mid / cols][mid % cols] == target) return true
        if (matrix[mid / cols][mid % cols] < target) start = mid + 1
        if (matrix[mid / cols][mid % cols] > target) end = mid - 1

    }
    return false
}