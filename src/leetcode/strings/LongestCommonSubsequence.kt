package leetcode.strings

fun longestCommonSubsequence(text1: String, text2: String): Int {
    return lengthOfLCS(text1, text2)
}

fun lengthOfLCS(a: String, b: String): Int {
    var m = a.length + 1
    var n = b.length + 1
    var C = Array<Array<Int>>(m){ Array(n){0}}

    for (i in 1 until m) {
        for (j in 1 until n) {
            if (a[i - 1] == b[j - 1]) C[i][j] = C[i - 1][j - 1] + 1
            else
                C[i][j] = Math.max(C[i - 1][j], C[i][j - 1])
        }
    }
    return C[m - 1][n - 1]
}