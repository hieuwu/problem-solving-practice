package leetcode.tree

import common.TreeNode
import java.util.*

fun preorderTraversal(root: TreeNode?): List<Int> {
    var res = mutableListOf<Int>()
    if (root == null) return res

    var stack = Stack<TreeNode>()
    stack.push(root)
    while (stack.isNotEmpty()) {
        var top = stack.pop()
        res.add(top.`val`)

        if (top?.right != null) stack.push(top?.right)
        if (top?.left != null) stack.push(top?.left)
    }

    return res
}
