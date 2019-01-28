// Complete the hourglassSum function below.
    static int hourglassSum(int[][] a) {
    
        int count = 0;

        int[] sum = new int[16];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int r = i; r < 3 + i; r++) {
                    for (int c = j; c < 3 + j; c++) {
                        if (r == i + 1 && c == j)
                            continue;
                        else if (r==i+1&& c==j+2)
                            continue;
                        else
                            sum[count] += a[r][c];
                    
                    }

                }
                count++;
            }
        }

        Arrays.sort(sum);

        return sum[sum.length-1];


    }
