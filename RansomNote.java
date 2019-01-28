
    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

        //List <String> list1 = Arrays.asList();
        List<String> list1 =new  ArrayList<String>(Arrays.asList(magazine));
        boolean M = true;
        for ( String x: note)
        {
            if ( list1.contains(x))
            {
                list1.remove(x);
            }
            else 
            {
           
            M = false;
            break;
            }
        }
        if(M)
        System.out.println("Yes");
        else
            System.out.println("No");



    }
