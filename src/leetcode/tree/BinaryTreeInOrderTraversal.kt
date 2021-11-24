package leetcode.tree

import common.TreeNode
import java.util.*

fun inorderTraversal(root: TreeNode?): List<Int> {
    //In order: left node right
    var res = mutableListOf<Int>()
    if (root == null) return res
    var stack = Stack<TreeNode>()
    var curr = root

    while (curr != null || stack.isNotEmpty()) {
        while (curr != null) {
            stack.push(curr)
            curr = curr?.left
        }
        curr = stack.pop()
        res.add(curr.`val`)
        curr = curr?.right

    }
    return res

}