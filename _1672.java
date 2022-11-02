public class _1672 {
    public static int  maximumWealth(int[][] accounts) {
    int maxSum = 0;

        for (int i = 0; i < accounts.length; i++) {
        int currentSum = 0;
        for (int j = 0; j < accounts[i].length; j++) {
            currentSum += accounts[i][j];
        }
        if (maxSum < currentSum) {
            maxSum = currentSum;
        }
    }
        return maxSum;
}
    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 2, 3 },
                { 3, 2, 1 }
        };
        System.out.println(maximumWealth(accounts));
    }

    }



