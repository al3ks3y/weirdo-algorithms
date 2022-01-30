package medium

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class RotateArrayTest {
    private val rotateArray = RotateArray()

    @Test
    fun test1() {
        val array = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        rotateArray.rotate(array, 3)
        assertContentEquals(intArrayOf(5, 6, 7, 1, 2, 3, 4), array)
    }

    @Test
    fun test2() {
        val array = intArrayOf(-1, -100, 3, 99)
        rotateArray.rotate(array, 2)
        assertContentEquals(intArrayOf(3, 99, -1, -100), array)
    }
}