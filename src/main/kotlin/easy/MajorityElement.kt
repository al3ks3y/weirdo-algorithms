package easy

//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
//
//
//Constraints:
//
//n == nums.length
//1 <= n <= 5 * 104
//-109 <= nums[i] <= 109
//
//
//Follow-up: Could you solve the problem in linear time and in O(1) space?
class MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        val counts = HashMap<Int, Int>()
        val threshold = nums.size / 2

        for (num in nums) {
            val newCount = (counts[num] ?: 0) + 1
            if (newCount > threshold) return num
            counts[num] = newCount
        }
        return -1
    }

}