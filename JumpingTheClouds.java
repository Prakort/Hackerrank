// Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int x = 0;
        int countzero = 0;

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 0)
                countzero++;
            else if (c[i] == 1) {
                if (countzero > 0) {
                    x += (countzero / 2) + 1;
                }
                countzero = 0;
            }
             if (i + 2 > c.length&&c[i]==0)

            {
                if (countzero > 1) {
                    x += countzero / 2;
                }
            }

        }

        return x;


    }
