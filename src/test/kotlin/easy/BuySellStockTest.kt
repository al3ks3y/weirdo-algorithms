package easy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BuySellStockTest {
    private val buySellStock = BuySellStock()

    @Test
    fun test() {
        assertEquals(5, buySellStock.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
    }

    @Test
    fun test2() {
        assertEquals(0, buySellStock.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
    }

    @Test
    fun test3() {
        assertEquals(5, buySellStock.maxProfit(intArrayOf(10, 4, 9, 1, 2)))
    }
}