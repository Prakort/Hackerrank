// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long count = 0;
        for (char c : s.toCharArray()) 
        {
            if (c == 'a')
                count++;

        }
        long factor = ((long)n / s.length());
        long R = (n % s.length());
        count = (long) (factor * count);
        for (int i = 0; i < R; i++) {
            if (s.charAt(i) == 'a')
                count++;
        }
    
        return (long)count;


    }

   
