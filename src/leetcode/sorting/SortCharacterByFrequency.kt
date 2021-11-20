package leetcode.sorting

import java.util.*
import kotlin.collections.HashMap

fun frequencySort(s: String): String {
    var charMap = HashMap<Char, Int>()
    for (c in s) {
        charMap[c] = charMap.getOrDefault(c, 0) + 1
    }

    var maxHeap = PriorityQueue<Char>({a: Char, b: Char -> charMap[b]!! - charMap[a]!!})
    maxHeap.addAll(charMap.keys)

    var result = StringBuilder()
    while (maxHeap.isNotEmpty()) {
        var current = maxHeap.remove()
        for (i in 0 until charMap[current]!!) result.append(current)
    }
    return result.toString()

}