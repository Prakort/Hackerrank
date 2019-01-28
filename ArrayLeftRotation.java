
    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int n) {
        
        int k = 0;
        while (k < n) {
            int len = a.length;
            int temp = a[0];
            for (int i = 1; i < len; i++) {
                a[i - 1] = a[i];
            }
            a[len - 1] = temp;
            k++;
        }
        return a;


    }
