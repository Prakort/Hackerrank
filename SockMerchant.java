
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {


        Arrays.sort(ar);
        Set<Integer> unique= new LinkedHashSet<Integer>();
        for (int x : ar)
            unique.add(x);
        
        int count=0;
        int i =0;
        int []countInt = new int[n];
        for (int x: unique)
        {
            for (int c: ar)
            {
                if ( x == c)
                    countInt[i]++;        
                    
            }
            i++;
        }
        for ( int d : countInt)
        {
            if(d!=0)
                count = count + d/2;
        }
        return count;
        
    }

  
