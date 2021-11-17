fun quickSelect(arr: Array<Int>, left: Int, right: Int, kIndex: Int) {
    if (kIndex !in left..right) return

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

    quickSelect(arr, left, j, kIndex)
    quickSelect(arr, i, right, kIndex)
}