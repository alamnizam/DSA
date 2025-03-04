package easy._1_Two_Sum

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class TwoSumTest {
    @Test
    fun twoSum1() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9

        val res: IntArray = twoSum(nums, target)
        assertEquals(target, nums[res[0]] + nums[res[1]])
    }

    @Test
    fun twoSum2() {
        val nums = intArrayOf(3,2,4)
        val target = 6

        val res: IntArray = twoSum(nums, target)
        assertEquals(target, nums[res[0]] + nums[res[1]])
    }

    @Test
    fun twoSum3() {
        val nums = intArrayOf(3,3)
        val target = 6

        val res: IntArray = twoSum(nums, target)
        assertEquals(target, nums[res[0]] + nums[res[1]])
    }
}