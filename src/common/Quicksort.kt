package common

fun quickSort(arr: Array<Int>, left: Int, right: Int) {
    if (left > right) return

    var pivot = arr[(left + right) / 2]
    var i = left
    var j = right

    while (i <= j) {
        while (arr[i] < pivot) i++
        while (arr[j] > pivot) j--
        if (i <= j) {
            arr[i] = arr[j].also { arr[j] = arr[i] }
            i++
            j--
        }
    }
    quickSort(arr, left, j)
    quickSort(arr, i, right)
}