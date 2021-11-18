package leetcode.linkedlist

import common.ListNode

fun middleNode(head: ListNode?): ListNode? {
    var walker = head
    var runner = head

    while (walker?.next != null && runner?.next != null) {
        walker = walker?.next
        runner = runner?.next?.next

    }
    return walker
}