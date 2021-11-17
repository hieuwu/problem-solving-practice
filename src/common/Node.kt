package common

data class Node(var num: Int) {
    var left: Node? = null
    var right: Node? = null
}
data class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
data class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}