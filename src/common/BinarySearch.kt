package common

//Count the number of elements which is less than key
fun countElementLessThanKey(arr: Array<Int>, key: Int): Long {
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

fun binarySearch(nums: Array<Int>, target:Int): Int {
    var left = 0
    var right = nums.size - 1

    while (left < right) {
        var mid = (left + right) / 2
        if (target > nums[mid]) left = mid + 1
        else right = mid
    }
    if (nums[left] == target) return left
    return -1
}