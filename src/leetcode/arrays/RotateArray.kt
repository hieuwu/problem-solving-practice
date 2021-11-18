package leetcode.arrays

fun rotate(nums: IntArray, k: Int): Unit {
    var mid = k % nums.size
    reverse(nums, 0, nums.size - 1)
    reverse(nums, mid, nums.size - 1)
    reverse(nums, 0, mid - 1)
}

fun reverse(arr: IntArray, start: Int, end: Int) {
    var left = start
    var right = end
    while (left < right) {
        arr[left] = arr[right].also { arr[right] = arr[left] }
        left++
        right--
    }

}