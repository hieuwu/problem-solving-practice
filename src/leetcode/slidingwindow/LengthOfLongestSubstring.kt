package leetcode.slidingwindow

fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty()) return 0
    if (s.length == 1) return 1
    var longestLength = Integer.MIN_VALUE

    var left = 0
    var right = 0
    var charMap = HashMap<Char, Int>()

    while (right < s.length) {
        var rightChar = s[right]
        if (charMap.containsKey(rightChar)) charMap[rightChar] = charMap[rightChar]!! + 1
        else charMap[rightChar] = 1

        while (charMap[rightChar]!! > 1) {
            charMap[s[left]] = charMap[s[left]]!! - 1
            left++
        }
        right++
        longestLength = Math.max(longestLength, right - left)
    }
    return longestLength
}