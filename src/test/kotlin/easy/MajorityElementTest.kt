package easy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MajorityElementTest {
    private val majorityElement = MajorityElement()

    @Test
    fun test1() {
        assertEquals(3, majorityElement.majorityElement(intArrayOf(3, 2, 3)))
    }
}