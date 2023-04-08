package Questions.GeeksforGeeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MakeTheArrayBeautiful {
    public static void main(String[] args) {
        int[] arr = {4,2,-2,1};
        System.out.println(makeBeautiful(arr));

    }
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        Stack<Integer> s = new Stack<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(s.size() != 0){
                if(((s.peek() >= 0) && (arr[i] < 0)) || ((s.peek() < 0) && (arr[i]>=0))){
                    s.pop();
                }
                else{
                    s.push(arr[i]);
                }
            }
            else{
                s.push(arr[i]);
            }
        }

        while(s.size() != 0){
            ans.add(s.pop());
        }
        Collections.reverse(ans);
        return ans;
    }
}
