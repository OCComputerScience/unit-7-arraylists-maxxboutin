package ArrayListEquals;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {

        //This code is just to test your equals method
        ArrayList<Integer> list1 = new ArrayList<>()
        {{
            add(10);
            add(9);
            add(5);
            add(2);
            add(9);
        }};

        ArrayList<Integer> list2 = new ArrayList<>()
        {{
            add(10);
            add(9);
            add(5);
            add(2);
            add(9);
        }};

        // Test if list 1 is equal to list 2
        boolean isSame = equals(list1, list2);
        System.out.println(isSame);

        ArrayList<Integer> list3 = new ArrayList<>()
        {{
            add(1);
            add(9);
            add(5);
            add(2);
            add(9);
        }};

        // Test if list 2 is equal to list 3
        boolean isSame2 = equals(list1, list3);
        System.out.println(isSame2);
    }


    public static boolean equals(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {

        //loops through the list and checks if the integers are equal
        for (int i = 0; i < list1.size(); i++)
        {

            if (!list1.get(i).equals(list2.get(i))) return false;

        }

        return true;

    }

}
