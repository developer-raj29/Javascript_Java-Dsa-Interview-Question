public class _16_BuyAndSell_Stock {
    public static int BuyAndSellStock(int prices[], int n) {
        int maxDayProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (buyPrice < prices[i]) { // Calculate profit if we have a buy price
                // Profit = Selling Price - Buying Price
                int profit = prices[i] - buyPrice;
                maxDayProfit = Math.max(maxDayProfit, profit);
            } else {
                // Update the buy price if Buy is less than the selling price
                buyPrice = prices[i];
            }
        }
        return maxDayProfit;
    }

    /*
     * Approach:
     * 1. Create a function BuyAndSellStock that takes an array of prices and its length as input.
     * 2. Initialize maxDayProfit = 0 and buyPrice = Integer.MAX_VALUE / +Infinity.
     * 3. Iterate through the prices array: from 0 to n.
     * 4. If BuyPrice < prices[i], calculate the profit as prices[i] - buyPrice. using Formula: Profit = Selling Price - Buying Price
     * 5. Update maxDayProfit with maximum of maxDayProfit and profit Ex: maxDayProfit = Math.max(maxDayProfit, profit);
     * 6. Else, update the buyPrice with prices[i] if BuyPrice > prices[i].
     * 7. Return maxDayProfit as the maximum profit.
     * 8. Time Complexity: O(n) as we are iterating through the array once.
     * 9. Space Complexity: O(1) as we are using only a constant amount of space.
     */

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int n = prices.length;

        System.out.println("Max profit: " + BuyAndSellStock(prices, n));
    }
}
