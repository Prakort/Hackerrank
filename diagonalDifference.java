
    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {

        int n = arr[0].length;
        int sum1 =0;
        int sum2 =0;
        for ( int i =0;i<n;i++)
        {
            sum1 += arr[i][i];
            sum2 += arr[i][n-1-i];
        }

        return Math.abs(sum1-sum2);

    }
