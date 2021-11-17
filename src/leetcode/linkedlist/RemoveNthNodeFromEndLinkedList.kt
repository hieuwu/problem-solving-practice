package leetcode.linkedlist

import common.ListNode

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    var totalNode = countNode(head)
    if (n == totalNode) return head?.next
    if (n == 0) return head?.next
    if (head == null) return head

    var start = 1
    var delIndex = totalNode - n
    var curr = head
    while (start < delIndex) {
        curr = curr?.next
        start++
    }
    curr?.next = curr?.next?.next

    return head
}

fun countNode(head: ListNode?): Int {
    var count = 0
    var p = head
    while (p != null) {
        count++
        p = p?.next

    }
    return count

}