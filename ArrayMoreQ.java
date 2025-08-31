import java.nio.channels.FileChannel.MapMode;

public class ArrayMoreQ {


    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }


    public static int trappedRainWater(int height[]){
        // calcualte left max boundary - array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1; i< height.length;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // calcualte right max boundary - array
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int trappedWater = 0;

        // loop
        for(int i=0; i<height.length; i++){
            // waterlevel = min(leftmax bound, rightmax bound)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = waterlevel - height[i]
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }

    



    public static void main(String[] args) {
        // int height[] = {4,2,0,6,3,2,5};
        int prices[] = {7,1,5,3,6,4};
        
        // System.out.println(trappedRainWater(height));
        System.out.println(buyAndSellStocks(prices));
    }
}
