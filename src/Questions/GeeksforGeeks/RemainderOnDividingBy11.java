package Questions.GeeksforGeeks;
// HEREEE
// Starting from the rightmost digit, we alternate between adding and subtracting the digits. That is, we add the rightmost digit, subtract the next digit to the left, add the next digit, and so on.
// If the result is divisible by 11, the original number is also divisible by 11, and the remainder is 0.
// Otherwise, the remainder is the absolute value of the result modulo 11.
public class RemainderOnDividingBy11 {
    public static void main(String[] args) {
        String x = "111111110";
        String y = "1345";
        int a = remainderOnDividingBy11(x);
        int b = remainderOnDividingBy11(y);
        System.out.println(a + " " + b);
    }
    static int remainderOnDividingBy11(String x){
        int n = x.length();
        int sum = 0;

        for(int i=n-1; i>=0; i--){
            int digit = x.charAt(i) - '0';
            if((n-i) % 2 == 0){
                sum = (sum - digit + 11) % 11;
            }
            else{
                sum = (sum + digit) % 11;
            }
        }
        return sum;
    }
}
