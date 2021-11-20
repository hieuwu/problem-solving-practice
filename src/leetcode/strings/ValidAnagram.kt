package leetcode.strings

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    var freqMap = HashMap<Char, Int>()
    for (c in s) {
        freqMap[c] = freqMap.getOrDefault(c, 0) + 1
    }

    for (c in t) {
        freqMap[c] = freqMap.getOrDefault(c, 0) - 1
    }

    for ((k, v) in freqMap) {
        if (v != 0) return false
    }
    return true

}