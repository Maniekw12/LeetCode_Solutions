package Day_1.best_time_to_sell_buy_stocks;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int price : prices) {
            if(price < minPrice){
                minPrice = price;
            }
            else{
                if(price - minPrice > maxProfit){
                    maxProfit = price - minPrice;
                }
            }
        }
        return maxProfit;
    }
}
