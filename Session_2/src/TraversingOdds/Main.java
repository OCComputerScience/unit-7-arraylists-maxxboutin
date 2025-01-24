package TraversingOdds;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {

        //makes an array list
        ArrayList<Integer> list = new ArrayList<>();

        //makes a for loop that will add all numbers from 0-50
        for (int i = 0; i <= 50; i++)
        {

            list.add(i);

        }

        //calls the methods to take the evens out of list and then prints it out
        removeEvens(list);
        printList(list);

    }

    //this method will remove all the even nums in arraylist
    public static void removeEvens(ArrayList<Integer> list)
    {

        //loops through the whole list and removes the evens
        for (int i = 0; i < list.size() - 1; i++)
        {

            //if even remove it
            if (list.get(i) % 2 == 0)
            {

                list.remove(i);
                i--;
            }

        }

    }

    //this method will print out the list
    public static void printList(ArrayList<Integer> list)
    {

        //the for loop will print out the whole list
        for (int i = 0; i < list.size() - 1; i++)
        {

            System.out.println(list.get(i));

        }

    }

}
