package leetcode.tree

import common.TreeNode
import java.util.*

fun levelOrder(root: TreeNode?): List<List<Int>> {
    var res: MutableList<MutableList<Int>> = MutableList<MutableList<Int>>(0){mutableListOf<Int>()}

    if (root == null) return res
    var queue: Queue<TreeNode> = LinkedList<TreeNode>()
    queue.add(root)
    var level = 0
    while (queue.isNotEmpty()) {
        var size = queue.size
        var currentLevel = mutableListOf<Int>()
        for (i in 0 until size) {
            var current = queue.remove()
            currentLevel.add(current.`val`)
            if (current?.left != null) queue.add(current?.left)
            if (current?.right != null) queue.add(current?.right)
        }
        res.add(currentLevel)
    }
    return res
}