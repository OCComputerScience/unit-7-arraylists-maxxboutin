package GetFirstElement;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {

        //makes an empty Integer array list
        ArrayList<Integer> list = new ArrayList<Integer>();

        //makes a for loop which will make 10 random numbers from 0 to 10
        for (int i = 0; i <= 10; i++)
        {

            int random = (int) (Math.random() * 10);
            list.add(random);

        }

        //gets and prints out the first and last element of the list
        System.out.println("First Num " + list.getFirst());
        System.out.println("Last Num " + list.getLast());

        //makes a for loop which will run through the list and if the index is odd it will be printed
        for (int loop : list)
        {

            if (loop % 2 == 1) {System.out.println(loop);}

        }

    }

}