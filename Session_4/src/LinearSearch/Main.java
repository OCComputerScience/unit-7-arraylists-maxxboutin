package LinearSearch;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Double> array = new ArrayList<>();
        array.add(4.5);
        array.add(6.7);
        array.add(5.0);
        array.add(2.9);
        array.add(7.0);

        //calls method
        search(array, 2.9);
    }

    public static void search (ArrayList<Double> array, double target)
    {

        //runs through the list
        for (int i = 0; i < array.size(); i++)
        {
            //if the number in the array is equal to the number that is the target then it will print it
            if (array.get(i) == target)
            {
                System.out.println(target);
            }

            //if it isn't the number of the target it will print -1
            else
            {
                System.out.println(-1);
            }
        }

    }
}
