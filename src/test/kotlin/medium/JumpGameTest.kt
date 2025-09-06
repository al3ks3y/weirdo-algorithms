package medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class JumpGameTest {
    private val jumpGame = JumpGame()

    @Test
    fun test1() {
        assertEquals(true, jumpGame.canJump(intArrayOf(2, 3, 1, 1, 4)))
    }

    @Test
    fun test2() {
        assertEquals(false, jumpGame.canJump(intArrayOf(3, 2, 1, 0, 4)))
    }

    @Test
    fun test3() {
        assertEquals(true, jumpGame.canJump(intArrayOf(2, 0, 0)))
    }
}