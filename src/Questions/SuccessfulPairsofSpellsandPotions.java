package Questions;
import java.util.Arrays;

public class SuccessfulPairsofSpellsandPotions {
    public static void main(String[] args) {
        int[] spells = {5,1,3};
        int[] potions = {1,2,3,4,5};
        long success = 7L;

        System.out.println(Arrays.toString(successfulPairs(spells,potions,success)));
    }
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        //Here time: (n+m)(logm)
        //space: O(logm)
        int[] ans = new int[spells.length];

        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int l = 0;
            int h = potions.length - 1;
            int successStartIdx = potions.length;

            while (l <= h) {
                int mid = l + (h - l) / 2;
                long curr = (long) spells[i] * potions[mid];

                if (curr >= success) {
                    successStartIdx = mid;
                    h = mid - 1;
                } else
                    l = mid + 1;
            }
            ans[i] = potions.length - successStartIdx;
        }
        return ans;
    }
    }
