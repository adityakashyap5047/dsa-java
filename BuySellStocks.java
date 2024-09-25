import java.util.*;

public class BuySellStocks {
    public static int max(int numbers[]){  //time complexity is O(n)
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
    public static int profit(int price[]){
        int rupees[] = new int[price.length];
        int buyPrice[] = new int[price.length];
        buyPrice[0] = price[0];
        for (int i = 1; i < price.length; i++) {
            buyPrice[i] = Math.min(buyPrice[i-1], price[i]);
        }
        for (int i = 0; i < price.length; i++) {
            if (i == 0) {
                rupees[i] = 0;
            }
            else if(i == 1) {
                rupees[i] = price[i] - price[i-1];
            }
            else{
                rupees[i] = price[i] - buyPrice[i];
            }
        }
        return max(rupees);
    }
    public static void main(String[] args) {
        int price[] = {7, 1, 5, 3, 6, 4};
        System.out.println(profit(price));
    }
}
