// Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
    Arrays.sort(ar);
    int max = ar[ar.length-1];
    int counter=0;
    for ( int x: ar)
    {
        if (x ==max)
            counter++;
    }
     return counter;

    }
