public class MaxProfit {
    public static void main(String[] args) {
        //int[] nums = new int[]{2, 7, 11, 15};
        int[] prices = {7,1,5,3,10,4};

        System.out.println(maxProfit(prices));;
    }

    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if ((prices[i] - buy) > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }

}
