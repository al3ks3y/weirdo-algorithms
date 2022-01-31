package easy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RichestCustomerTest {
    private val richestCustomer = RichestCustomer()

    @Test
    fun test1() {
        assertEquals(
            6,
            richestCustomer.maximumWealth(arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1)))
        )
    }

    @Test
    fun test2() {
        assertEquals(
            10,
            richestCustomer.maximumWealth(arrayOf(intArrayOf(1, 5), intArrayOf(3, 7), intArrayOf(5, 3)))
        )
    }
}