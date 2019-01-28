
    // Complete the minimumBribes function below.
    static void minimumBribes(int[] a) {
        boolean yes = false;
        int counter = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] - (i + 1) > 2) {
                yes = true;
                break;

            }
            for (int j = Math.max(0, a[i] - 1 - 1); j < i; j++) 
            {
                if (a[j] > a[i])
                    counter++;

            }

        }
        if (yes = true)
            System.out.println("Too chaotic");
        else
            System.out.println(counter);   
        

    }
