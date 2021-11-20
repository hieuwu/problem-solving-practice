package leetcode.strings

fun firstUniqChar(s: String): Int {
    var charMap = HashMap<Char, Int>()
    for (c in s) {
        charMap.getOrDefault(c, 0) + 1
    }
    for (i in s.indices) {
        if (charMap[s[i]]!! == 1) return i
    }
    return -1
}