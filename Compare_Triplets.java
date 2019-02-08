// Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) 
    {   List<Integer> s = new ArrayList<>();
        int counter1=0,counter2=0;
        for ( int i=0; i < a.size();i++)
        {
            if (a.get(i)>b.get(i))
            {
                counter1++;
            }
            else if (a.get(i) <b.get(i))
            {
                counter2++;
            }
        }
        s.add(counter1);
        s.add(counter2);
        return s;

    }
