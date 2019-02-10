// Complete the staircase function below.
    static void staircase(int n) {
    for ( int k = 0 ; k<n;k++)
    {
        for ( int i =0 ; i<n;i++)
        {
            if ( i < n-k-1)
            {
                System.out.print(" ");
            }
            else 
            {
                System.out.print("#");
            }
        }
        System.out.print("\n");

    }
    }
