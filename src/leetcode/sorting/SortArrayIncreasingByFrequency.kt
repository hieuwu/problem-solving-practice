package leetcode.sorting

import java.util.*
import kotlin.collections.HashMap

fun frequencySort(nums: IntArray): IntArray {
    var numMap = HashMap<Int, Int>()
    var result = mutableListOf<Int>()
    for (num in nums) {
        numMap[num] = numMap.getOrDefault(num, 0) + 1
    }

    var maxHeap = PriorityQueue<Int>({a, b -> if (numMap[a]!! != numMap[b]!!) numMap[a]!! - numMap[b]!!
    else b - a})

    maxHeap.addAll(numMap.keys)

    while (maxHeap.isNotEmpty()) {
        var current = maxHeap.remove()
        for (i in 0 until numMap[current]!!) result.add(current)
    }
    return result.toIntArray()
}