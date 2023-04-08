package Questions.GeeksforGeeks;

public class EqualSumSubarrayLeftRight {
    public static void main(String[] args) {
        int[] A = new int[]{1,23};
        int N = A.length;
        int x = equalSum(A,N);
        System.out.println("ANSWER");
        System.out.println(x);

    }
    static int equalSum(int [] A, int N) {
        //Write your code here
        if(N == 1)
            return A[1];

        int leftSum = 0, rightSum = 0;

        for(int i=0; i< N; i++){
            rightSum = rightSum + A[i];
        }
        System.out.println(rightSum);
        rightSum = rightSum - A[0];
        System.out.println(rightSum);

        for(int i=0, j=1; j < N; i++,j++){
            rightSum = rightSum - A[j];
            System.out.println(rightSum);
            leftSum = leftSum + A[i];

            System.out.println(leftSum);
            if(leftSum == rightSum){
                return i+1;
            }

        }
        return -1;
    }
}
