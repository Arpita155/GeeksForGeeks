package GeeksForGeeks.Arrays.Medium;

//Q. Given an array arr[] denoting the cost of stock on each day, the task is to find the maximum total profit if we can buy and sell the stocks any number of times.
//
//Note: We can only sell a stock which we have bought earlier and we cannot hold multiple stocks on any day.

//--------Explanation:--------
//Input: arr[] = [100, 180, 260, 310, 40, 535, 695]
//Output: 865
//Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210 Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655 Maximum Profit  = 210 + 655 = 865

public class StockBuyAndSell {

    public static int stockBuySell(int arr[]) {
        // code here
        int totalProfit = 0;
        int max = arr[0], min= arr[0];

        for(int i=1; i<arr.length ; i++) {

            if(arr[i]>max) {

                max = arr[i];
            } else if(arr[i] < max && (max > min)) {
                totalProfit += (max-min);

                max = arr[i];
                min = arr[i];

            } else if(arr[i] < min ) {

                min = arr[i];
                max = arr[i];

            }
        }

        if((max > min)) {
            totalProfit += (max-min);
        }

        return totalProfit;
    }

    public static void main(String[] args) {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(stockBuySell(arr));    // 865
    }
}
