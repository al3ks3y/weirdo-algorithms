package medium

//You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
//
//Return true if you can reach the last index, or false otherwise.
//
//
//
//Example 1:
//
//Input: nums = [2,3,1,1,4]
//Output: true
//Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
//Example 2:
//
//Input: nums = [3,2,1,0,4]
//Output: false
//Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
class JumpGame {
    fun canJump(nums: IntArray): Boolean {
        nums.asList().forEachIndexed { index, i ->
            if (i == 0 && index != nums.size - 1) {
                if (!canJumpOverThisZero(nums, index)) {
                    return false
                }
            }
        }
        return true
    }

    private fun canJumpOverThisZero(nums: IntArray, index: Int): Boolean {
        var tempIndex = index - 1
        while (tempIndex >= 0) {
            val elementBefore = nums[tempIndex]
            if (elementBefore <= index - tempIndex) {
                tempIndex--
                continue
            } else return true
        }
        return false
    }
}