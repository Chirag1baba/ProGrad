import java.util.ArrayList;
import java.util.List;

public class CoinChange {

    public static List<Integer> getMinCoins(int changeAmount, int[] coinDenominations) {
        List<Integer> coins = new ArrayList<>();
        for (int i = coinDenominations.length - 1; i >= 0; i--) {
            while (changeAmount >= coinDenominations[i]) {
                changeAmount -= coinDenominations[i];
                coins.add(coinDenominations[i]);
            }
        }
        return coins;
    }

    public static void main(String[] args) {
        int changeAmount = 43;
        int[] coinDenominations = {1, 2, 5, 10};
        List<Integer> coins = getMinCoins(changeAmount, coinDenominations);
        System.out.println("Coins: " + coins);
    }
}
