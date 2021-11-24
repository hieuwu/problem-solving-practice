package leetcode.tree

import common.TreeNode
import java.util.*

fun postorderTraversal(root: TreeNode?): List<Int> {
    //Postorder: left right node
    var res = mutableListOf<Int>()

    if (root == null) return res
    var stack = Stack<TreeNode>()
    var curr = root
    while (true) {
        while (curr != null) {
            stack.push(curr)
            stack.push(curr)
            curr = curr?.left
        }

        if (stack.isEmpty()) return res
        curr = stack.pop()
        if (stack.isNotEmpty() && curr == stack.peek()) curr = curr?.right
        else {
            res.add(curr.`val`)
            curr = null
        }
    }
    return res
}