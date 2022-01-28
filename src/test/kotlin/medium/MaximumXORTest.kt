package medium

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MaximumXORTest {
    private val maximumXor=MaximumXOR()

    @Test
    fun test(){
        Assertions.assertEquals(28, maximumXor.findMaximumXOR(intArrayOf(3,10,5,25,2,8)))
    }

    @Test
    fun test2(){
        Assertions.assertEquals(127, maximumXor.findMaximumXOR(intArrayOf(14,70,53,83,49,91,36,80,92,51,66,70)))
    }

    @Test
    fun test3(){
        Assertions.assertEquals(10, maximumXor.findMaximumXOR(intArrayOf(8,10,2)))
    }
}