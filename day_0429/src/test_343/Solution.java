package test_343;

public class Solution {

    public static void main(String[] args) {
        int[] A={1,3,2,4};
        int[] B={3,1,2,4};
        int[] result = findThePrefixCommonArray(A, B);
        for (int i:result) {
            System.out.println(i);

        }
    }
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] dp = new int[A.length+1];
        dp[0]=0;
        for (int i = 1; i < A.length; i++) {
            dp[i] = dp[i-1]+isConExist(A,B,i,i);
        }
        int[] res = new int[A.length];
        for (int i = 0; i < dp.length-1; i++) {
            res[i] = dp[i+1];
        }
        return res;
    }
    public static int isConExist(int[] A, int[] B, int a, int b){
        int ae=0;
        int be=0;
        for (int i = 0; i < A.length; i++) {
            if(B[b]==A[i]){
                ae=1;
            }
        }
        for (int i = 0; i < B.length; i++) {
            if (A[a]==B[i]){
                be=1;
            }
        }
        if(ae==1 && be==1){
            return 1;
        }
        else {
            return 0;
        }
    }

}
