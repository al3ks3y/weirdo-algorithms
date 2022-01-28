package easy

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TwoSumTest {
    private val twoSum= TwoSum()

    @Test
    fun test(){
        val result= arrayOf(0,1)
        val testIntArray= intArrayOf(2,7,11,15)
        Assertions.assertTrue(twoSum.twoSum(testIntArray,9).all {int-> result.contains(int) })
    }

    @Test
    fun test2(){
        val result= arrayOf(1,2)
        val testIntArray= intArrayOf(3,2,4)
        Assertions.assertTrue(twoSum.twoSum(testIntArray,6).all {int-> result.contains(int) })
    }
}