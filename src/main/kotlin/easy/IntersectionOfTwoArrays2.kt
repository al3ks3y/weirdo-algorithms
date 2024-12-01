package easy

class IntersectionOfTwoArrays2 {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val counts1 = nums1.asList().groupingBy { it }.eachCount()
        val counts2 = nums2.asList().groupingBy { it }.eachCount()
        val intersection = mutableListOf<Int>()

        for ((key, count1) in counts1) {
            val count2 = counts2.getOrDefault(key, 0)
            val minCount = minOf(count1, count2)
            repeat(minCount) { intersection.add(key) }
        }

        return intersection.toIntArray()
    }
}