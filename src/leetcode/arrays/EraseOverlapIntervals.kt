package leetcode.arrays

fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
    quickSort(intervals, 0, intervals.size - 1)

    var count = 1
    var prevEnd = intervals[0][1]

    for (i in 1 until intervals.size) {
        if (intervals[i][0] >= prevEnd) {
            prevEnd = intervals[i][1]
            count++
        }
    }
    return intervals.size - count
}


fun quickSort(arr: Array<IntArray>, left: Int, right: Int) {
    if (left > right) return

    var i = left
    var j = right
    var pivot = arr[(left + right) / 2][1]
    while (i <= j) {
        while (arr[i][1] < pivot) i++
        while (arr[j][1] > pivot) j--
        if (i <= j) {
            arr[i] = arr[j].also { arr[j] = arr[i]}
            i++
            j--
        }
    }

    quickSort(arr, left, j)
    quickSort(arr, i, right)
}