package Day 1;

public class SellStock {
    public int maxProfit(int[] prices) {
        int maximumProfit = 0;
        var minimumPrice = prices[0];
        for(int price : prices) {
            if (price < minimumPrice) {
                minimumPrice = price;
            }
            if (maximumProfit < price - minimumPrice) {
                maximumProfit = price - minimumPrice;
            }
        }
        return maximumProfit;
    }
}