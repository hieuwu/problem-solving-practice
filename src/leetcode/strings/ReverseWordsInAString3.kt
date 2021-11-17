package leetcode.strings

fun reverseWords(s: String): String {
    var start = 0
    var res = s.toCharArray()
    for (i in s.indices) {
        if (res[i] == ' ') {
            reverse(res, start, i - 1)
            start = i + 1
        }
        if (i == s.length - 1) {
            reverse(res,start, i)
        }
    }

    return String(res)
}

fun reverse(s: CharArray, start: Int, end: Int) {
    var left = start
    var right = end

    while (left < right) {
        s[left] = s[right].also {s[right] = s[left]}
        left++
        right--
    }
}