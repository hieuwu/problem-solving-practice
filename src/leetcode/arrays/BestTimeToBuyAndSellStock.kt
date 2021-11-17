package leetcode.arrays

fun maxProfit(prices: IntArray): Int {
    var min = Integer.MAX_VALUE
    var maxProfit = Integer.MIN_VALUE

    for (price in prices) {
        if (price < min) min = price
        if (price - min > maxProfit) maxProfit = price - min
    }
    return maxProfit
}