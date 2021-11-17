package common

import java.util.*

fun inorderStack(root: Node) {
    var stack = Stack<Node>()
    var curr: Node? = root
    while (root?.left != null && stack.isNotEmpty()) {
        stack.push(curr)
        curr = curr?.left
    }
    curr = stack.pop()
    println(curr.num)
    curr = curr?.right
}