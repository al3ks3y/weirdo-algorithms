package easy

class RichestCustomer {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var max = accounts[0].sum()
        for (i in 1..accounts.lastIndex) {
            val sum = accounts[i].sum()
            if (sum > max) {
                max = sum
            }
        }
        return max
    }
}