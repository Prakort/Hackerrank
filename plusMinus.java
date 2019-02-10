
    // Complete the plusMinus function below.
    static void plusMinus(float[] arr) {
        DecimalFormat df = new DecimalFormat("#.000000");
        df.format(0.912385);
        int a[]=new int[3];
        float n = arr.length;
        for ( float x : arr)
        {
            if(x>0)
                a[0]++;
            else if ( x<0)
                a[1]++;
            else if ( x ==0)
                a[2]++;
        }
        System.out.println("0"+df.format(a[0]/n));
        System.out.println("0"+df.format(a[1]/n));
        System.out.println("0"+df.format(a[2]/n));


    }

