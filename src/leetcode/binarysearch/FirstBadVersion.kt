package leetcode.binarysearch

fun isBadVersion(version: Int): Boolean = false
fun firstBadVersion(n: Int): Int {
    var left = 1
    var right = n

    while (left < right) {
        var mid = left + (right - left) / 2

        if (isBadVersion(mid)) right = mid
        else left = mid + 1
    }

    return left
}