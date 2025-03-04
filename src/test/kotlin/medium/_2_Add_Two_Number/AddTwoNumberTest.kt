package medium._2_Add_Two_Number

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class AddTwoNumberTest {

    @Test
    fun addTwoNumbers1() {
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

        val l3 = ListNode(7).apply {
            next = ListNode(0).apply {
                next = ListNode(8)
            }
        }
        val result = addTwoNumbers(l1,l2)
        assertEquals(result?.`val`,l3.`val`)
        assertEquals(result?.next?.`val`,l3.next?.`val`)
        assertEquals(result?.next?.next?.`val`,l3.next?.next?.`val`)
    }

    @Test
    fun addTwoNumbers2() {
        val l1 = ListNode(0)

        val l2 = ListNode(0)

        val l3 = ListNode(0)
        val result = addTwoNumbers(l1,l2)
        assertEquals(result?.`val`,l3.`val`)
    }

    @Test
    fun addTwoNumbers3() {
        val l1 = ListNode(9).apply {
            next = ListNode(9).apply {
                next = ListNode(9).apply {
                    next = ListNode(9).apply {
                        next = ListNode(9).apply {
                            next = ListNode(9).apply {
                                next = ListNode(9)
                            }
                        }
                    }
                }
            }
        }

        val l2 = ListNode(9).apply {
            next = ListNode(9).apply {
                next = ListNode(9).apply {
                    next = ListNode(9)
                }
            }
        }

        val l3 = ListNode(8).apply {
            next = ListNode(9).apply {
                next = ListNode(9).apply {
                    next = ListNode(9).apply {
                        next = ListNode(0).apply {
                            next = ListNode(0).apply {
                                next = ListNode(0).apply {
                                    next = ListNode(1)
                                }
                            }
                        }
                    }
                }
            }
        }
        val result = addTwoNumbers(l1,l2)
        assertEquals(result?.`val`,l3.`val`)
        assertEquals(result?.next?.`val`,l3.next?.`val`)
        assertEquals(result?.next?.next?.`val`,l3.next?.next?.`val`)
        assertEquals(result?.next?.next?.next?.`val`,l3.next?.next?.next?.`val`)
        assertEquals(result?.next?.next?.next?.next?.`val`,l3.next?.next?.next?.next?.`val`)
        assertEquals(result?.next?.next?.next?.next?.next?.`val`,l3.next?.next?.next?.next?.next?.`val`)
        assertEquals(result?.next?.next?.next?.next?.next?.next?.`val`,l3.next?.next?.next?.next?.next?.next?.`val`)
        assertEquals(result?.next?.next?.next?.next?.next?.next?.next?.`val`,l3.next?.next?.next?.next?.next?.next?.next?.`val`)
    }
}