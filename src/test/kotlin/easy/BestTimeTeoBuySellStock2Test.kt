package easy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BestTimeTeoBuySellStock2Test {
    val solution = BestTimeToBuySellStock2()

    @Test
    fun main() {
        val prices1 = intArrayOf(7, 1, 5, 3, 6, 4)
        val profit1 = solution.maxProfit(prices1) // profit1 will be 7
        assertEquals(7, profit1)


    }

    @Test
    fun test2() {
        val prices2 = intArrayOf(1, 2, 3, 4, 5)
        val profit2 = solution.maxProfit(prices2) // profit2 will be 4
        assertEquals(4, profit2)
    }

    @Test
    fun test3() {
        val prices3 = intArrayOf(7, 6, 4, 3, 1)
        val profit3 = solution.maxProfit(prices3) // profit3 will be 0
        assertEquals(0, profit3)
    }
}