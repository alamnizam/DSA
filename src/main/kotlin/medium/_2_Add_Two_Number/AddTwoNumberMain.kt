package medium._2_Add_Two_Number

/**
 * Sliding Window Problem
 *
 * Add Two Number
 *
 *      You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 *      You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *
 *      Input: l1 = [2,4,3], l2 = [5,6,4]
 *      Output: [7,0,8]
 *      Explanation: 342 + 465 = 807.
 *
 * Example 2:
 *
 *      Input: l1 = [0], l2 = [0]
 *      Output: [0]
 *
 * Example 3:
 *
 *      Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 *      Output: [8,9,9,9,0,0,0,1]
 *
 * Constraints:
 *
 *      The number of nodes in each linked list is in the range [1, 100].
 *      0 <= Node.val <= 9
 *      It is guaranteed that the list represents a number that does not have leading zeros.
 *
 * Question [Link](https://leetcode.com/problems/add-two-numbers/description/)
 */

fun main(){
    val l1 = ListNode(2).apply {
        next = ListNode(4).apply {
            next = ListNode(3)
        }
    }

    val l2 = ListNode(5).apply {
        next = ListNode(6).apply {
            next = ListNode(4)
        }
    }

    val result = addTwoNumbers(l1,l2)
    printLinkedList(result)
}

fun printLinkedList(node: ListNode?) {
    var current = node
    print("[")
    while (current != null) {
        print("${current.`val`}")
        if (current.next != null) {
            print(", ")
        }
        current = current.next
    }
    println("]")
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val result = ListNode(-1)
    var current = result
    var carry = 0

    var temp1 = l1
    var temp2 = l2

    while (temp1 != null || temp2 != null || carry > 0){
        val sum = (temp1?.`val` ?: 0) + (temp2?.`val` ?: 0) + carry
        carry = sum / 10

        current.next = ListNode(sum % 10)
        current = current.next!!

        temp1 = temp1?.next
        temp2 = temp2?.next
    }

    return result.next
}