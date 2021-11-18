package leetcode.linkedlist

import common.ListNode

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    if (l1 == null && l2 != null) return l2
    if (l1 !=null && l2 == null) return l1
    if (l1 == null && l2 == null) return null
    var p1 = l1
    var p2 = l2
    var res: ListNode? = null
    var head: ListNode? = null

    if (l1!!.`val` < l2!!.`val`) res = ListNode(l1!!.`val`) else res = ListNode(l2!!.`val`)
    head = res
    while (p1 != null && p2 != null) {
        if (p1.`val` < p2.`val`) {
            res?.next = p1
            p1 = p1?.next
        }
        else {
            res?.next = p2
            p2 = p2?.next
        }
        res = res?.next

    }

    if (p1 != null) {
        res?.next = p1
    }

    if (p2 != null) {
        res?.next = p2
    }

    return head?.next
}