package leetcode.arrays
val dir = intArrayOf(0, 1, 0, -1, 0)

fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
    if (image[sr][sc] == newColor) return image

    var m = image.size
    var n = image[0].size

    var oldColor = image[sr][sc]
    image[sr][sc] = newColor

    for (i in 0 until 4) {
        var nr = sr + dir[i]
        var nc = sc + dir[i + 1]
        if (nr < 0 || nr == m || nc < 0 || nc == n || image[nr][nc] != oldColor) continue
        floodFill(image, nr, nc, newColor)
    }

    return image
}