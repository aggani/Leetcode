public class BestTimeStock121 {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int diff = 0;
        int currentMin = prices[0];
        int bestDiff = 0;
        for(int i=1; i<n; i++){
            diff = prices[i] - currentMin;
            if(diff > bestDiff){
                bestDiff = diff;
            }
            if(prices[i] < currentMin){
                currentMin = prices[i];
            }
        }
        return bestDiff;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));

    }
}
