package easy

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val indexesMap=HashMap<Int, Int>()
        nums.forEachIndexed{index, num->
            if(indexesMap.get(num)!=null){
                return intArrayOf(indexesMap.get(num)!!,index)
            }
            indexesMap.put(target-num, index)
        }
        throw RuntimeException()
    }
}