package leetcode.strings

fun checkInclusion(s1: String, s2: String): Boolean {
    if (s1.length > s2.length) return false

    var occ1 = Array(26) { 0 }
    var occ2 = Array(26) { 0 }

    var left = 0
    var right = 0
    while (right < s1.length) {
        occ1[s1[right] - 'a'] += 1
        occ2[s2[right] - 'a'] += 1
        right++
    }
    right--

    while (right < s2.length) {
        if (isMatched(occ1, occ2)) return true
        right++
        if (right != s2.length) occ2[s2[right] - 'a'] += 1
        occ2[s2[left] - 'a'] -= 1
        left++

    }

    return false
}

fun isMatched(a: Array<Int>, b: Array<Int>): Boolean {
    for (i in a.indices) {
        if (a[i] != b[i]) return false
    }
    return true
}