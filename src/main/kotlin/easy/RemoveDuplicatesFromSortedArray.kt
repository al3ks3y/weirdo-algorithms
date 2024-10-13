package easy

class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        var lastSortedElementIndex = 0
        var currentInt = -101
        nums.forEachIndexed { index, i ->
            if (i > currentInt) {
                nums[lastSortedElementIndex] = i
                lastSortedElementIndex++
                currentInt = i

            } else {
                if (index >= nums.size - 1) {
                    return@forEachIndexed
                }
                nums[index] = nums[index + 1]
            }
        }
        return lastSortedElementIndex
    }
}