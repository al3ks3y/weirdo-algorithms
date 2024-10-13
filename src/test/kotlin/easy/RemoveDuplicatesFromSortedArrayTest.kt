package easy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RemoveDuplicatesFromSortedArrayTest {
    private val removeDuplicatesFromSortedArray = RemoveDuplicatesFromSortedArray()

    @Test
    fun test1() {
        val input = intArrayOf(1, 1, 2)
        assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicates(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        assertEquals(5, removeDuplicatesFromSortedArray.removeDuplicates(input))
    }
}