import java.util.*

fun dfs(grid: Array<Array<Int>>) {
    val dRow = intArrayOf(0, 1, 0, -1)
    val dCol = intArrayOf(-1, 0, 1, 0)

    val m = grid.size
    val n = grid[0].size
    val visited = Array(m) { Array(n) { false } }

    val stack = Stack<pair>()
    stack.push(pair(0, 0))

    while (stack.isNotEmpty()) {
        val curr = stack.pop()

        val x = curr.first!!
        val y = curr.second!!

        if (!isValid(visited, x, y)) continue
        visited[x][y] = true
        print("${grid[x][y]}   ")

        for (i in 0 until 4) {
            val adjX = x + dRow[i]
            val adjY = y + dCol[i]
            stack.push(pair(adjX, adjY))
        }
    }
}

fun dfsV2(grid: Array<Array<Int>>, row: Int, col: Int, visit: Array<Array<Boolean>>) {
    val dRow = intArrayOf(0, 1, 0, -1)
    val dCol = intArrayOf(-1, 0, 1, 0)
    visit[row][col] = true
    print("${grid[row][col]}   ")
    for (i in 0 until 4) {
        if (!isValid(visit, row + dRow[i], col + dCol[i])) continue
        dfsV2(grid, row + dRow[i], col + dCol[i], visit)
    }
}

fun isValid(visit: Array<Array<Boolean>>, row: Int, col: Int): Boolean {
    var M = visit.size
    var N = visit[0].size
    if (row < 0 || col < 0 || row >= M || col >= N) {
        return false
    }

    if (visit[row][col]) return false
    return true
}
