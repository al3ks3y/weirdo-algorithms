package easy

class BuySellStock {
    fun maxProfit(prices: IntArray): Int {
        var min = prices[0]
        var profit = 0
        for (index in 1..prices.lastIndex) {
            if (prices[index] > min && profit < prices[index] - min) {
                profit = prices[index] - min
            } else if (prices[index] < min) {
                min = prices[index]
            }
        }
        return profit
    }
}