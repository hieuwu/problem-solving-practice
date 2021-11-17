package common

import java.util.*
fun bfs(grid: Array<Array<Int>>) {
    var dirs = intArrayOf(0, 1, 0, -1, 0)
    var m = grid.size
    var n = grid[0].size
    var visited = Array(m) { Array(n) { false } }


    var queue = LinkedList<pair>()
    queue.add(pair(0, 0))
    visited[0][0] = true

    while (!queue.isEmpty()) {
        val cell = queue.peek()
        val x = cell.first!!
        val y = cell.second!!
        queue.remove()
        for (i in 0 until 4) {
            val adjX = x + dirs[i]
            val adjY = y + dirs[i + 1]
            if (isValid(visited, adjX, adjY)) {
                queue.add(pair(adjX, adjY))
                visited[adjX][adjY] = true
            }
        }
        print("${grid[x][y]}   ")
    }
}