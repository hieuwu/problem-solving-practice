package leetcode.linkedlist

import common.ListNode

fun reverseList(head: ListNode?): ListNode? {
    if (head == null) return head

    var p = head
    var next: ListNode? = null
    var prev: ListNode? = null

    while (p != null) {
        next = prev
        prev = p
        p = p?.next
        prev?.next = next
    }
    return prev
}