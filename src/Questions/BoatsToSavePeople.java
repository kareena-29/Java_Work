package Questions;
// Complexity : Time - O(nlogn) => logn for sort and n for while loop
//              Space - O(logn) => in sorting only
import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        int[] people = new int[]{3,5,3,4};
        int limit = 5;
        System.out.println(numRescueBoats(people,limit));

    }
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int ans = 0;
        int i = 0, j = people.length - 1;
        while(i <= j){
            if(people[i] == limit){
                ans = ans + (j - i);
                break;
            }
            if(people[i] + people[j] <= limit){
                ans++;
                j--;
                i++;
            }
            else{
                ans++;
                j--;
            }

        }
        return ans;
    }
}
