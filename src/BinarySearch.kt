
fun binarySearchCount(arr: Array<Int>, key: Int): Long {
    var count = 0L;
    var left = 0;
    var right = arr.size - 1;
    while (left <= right) {
        var mid = (right + left) / 2
        if (arr[mid] <= key) {
            count = mid + 1L
            left = mid + 1
        } else
            right = mid - 1;
    }
    return count;
}