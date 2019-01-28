// Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        boolean val = false;
        boolean mont = false;
        boolean seaLevel = false;
        int cDown = 0;
        int cStep = 0;
        int cUp = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'D') {
                cDown++;
                val = true;
                mont = false;

            } else if (ch[i] == 'U') {
                cUp++;
                mont = true;
                val = false;
            }
       

            if (val == false && mont == true && cUp - cDown == 0) {
               
                cStep++;
                cDown = 0;
                cUp = 0;
            }

          
        }
        return cStep;


    }
