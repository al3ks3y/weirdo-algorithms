package medium

class RotateArray {
    fun rotate(nums: IntArray, k: Int) {
        repeat(k % nums.size) { rotateArrayOnce(nums) }
    }

    private fun rotateArrayOnce(nums: IntArray): IntArray {
        var previous = 0
        nums.forEachIndexed { index, num ->
            run {
                if (index == 0) {
                    nums[0] = nums.last()
                    previous = num
                } else {
                    nums[index] = previous
                    previous = num
                }
            }
        }
        return nums
    }
}