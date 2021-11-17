package leetcode.arrays

fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
    var res = mutableListOf<Boolean>()
    var max = Integer.MIN_VALUE
    for (item in candies) if (item > max) max = item

    for(item in candies) {
        res.add(item + extraCandies >= max)
    }
    return res.toBooleanArray()
}