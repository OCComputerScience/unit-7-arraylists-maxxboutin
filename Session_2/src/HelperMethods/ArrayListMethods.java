package HelperMethods;

import java.util.ArrayList;

public class ArrayListMethods
{

    public static void main(String[] args)
    {

        //makes list and adds values
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(13.45);
        prices.add(08.99);
        prices.add(02.95);
        prices.add(07.88);
        prices.add(12.56);
        prices.add(01.23);

        //condenses the list
        condense(prices);

        //prints the list
        print(prices);

        //duplicates the whole list
        duplicate(prices);

    }

    //prints out the list
    public static void print(ArrayList<Double> list)
    {

        for (Double loop : list)
        {
            System.out.println(loop);
        }

    }

    //decreases the size of the list
    public static void condense(ArrayList<Double> list) {

        //makes a temp variable for the condensed value in the list
        double condensedVal = 0;

        //loops the list
        for (int i = 0; i < list.size() - 1; i++)
        {
            //multiplies the first and second index's then saves
            condensedVal = list.get(i) * list.get(i + 1);

            //sets the multiplied value to current index
            list.set(i, condensedVal);

            //removes the element in the index of the list plus one
            list.remove(list.get(i + 1));

        }

    }

    //duplicates any array list input
    public static void duplicate(ArrayList<Double> list)
    {

        //makes new arraylist
        ArrayList<Double> duplicateList = new ArrayList<>();

        //adds all the elements to the list
        duplicateList.addAll(list);

        //prints out the duplicated list
        System.out.println(duplicateList);

    }


}