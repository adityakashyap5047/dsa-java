import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class GreedyIndianCoins {
    
    public static void main(String[] args) {
        
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countCoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < coins.length; i ++){
            if(coins[i] <= amount){
                while (coins[i] <= amount) {
                    ans.add(coins[i]);
                    countCoins++;
                    amount -= coins[i];
                }
            }
        }

        System.out.println("The min no. of coin that should be given is = "+countCoins+" And the coin should be = "+ans);
    }
}
