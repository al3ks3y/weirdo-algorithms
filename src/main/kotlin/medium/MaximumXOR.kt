package medium

class MaximumXOR {
    fun findMaximumXOR(nums: IntArray): Int {
        if (nums.size == 1) {
            return nums[0] xor nums[0]
        }
        var currentMax = Int.MIN_VALUE
        val alreadyXored = mutableSetOf<Int>()
        nums.forEachIndexed { index, int ->
            if (!alreadyXored.contains(int)) {
                val alreadySearched = mutableSetOf<Int>()
                nums.forEachIndexed { index2, secondInt ->
                    if (!alreadySearched.contains(secondInt)) {
                        if (index2 > index) {
                            val curentXor = int xor secondInt
                            if (curentXor > currentMax) {
                                currentMax = curentXor
                            }
                        }
                        alreadySearched.add(secondInt)
                    }
                }
            }
            alreadyXored.add(int)
        }
        return currentMax
    }
}