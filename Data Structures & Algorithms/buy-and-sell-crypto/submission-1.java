class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int maxPrice=0;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                int profit=prices[r]-prices[l];
                maxPrice=Math.max(maxPrice,profit);
            } else{
                l=r;
            }
            r++;
        }
        return maxPrice;
    }
}
