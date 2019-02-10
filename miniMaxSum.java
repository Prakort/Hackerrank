// Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    
    long []sum = new long[5];
    for ( int i =0 ;i<5 ;i++)
    {
        if( i!=0)
            sum[0]+=arr[i];
        if ( i!=1)
            sum[1]+=arr[i];
        if( i!=2)
            sum[2]+=arr[i];
        if( i!=3)
            sum[3]+=arr[i];
        if( i!=4)   
            sum[4]+=arr[i];
    }
    Arrays.sort(sum);
    System.out.println(sum[0]+" "+sum[4]);

    }
