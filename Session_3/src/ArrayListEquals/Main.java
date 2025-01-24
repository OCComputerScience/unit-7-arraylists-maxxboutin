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

        // Test if list1 is equal to list 2
        equals();

        ArrayList<Integer> list3 = new ArrayList<>()
        {{
            add(1);
            add(9);
            add(5);
            add(2);
            add(9);
        }};

        // Test if list 2 is equal to list 3

    }

    public boolean equals(ArrayList<Integer> , ArrayList<Integer> list2)
    {

        for (int i = 0; i < a; i++) {}

    }

}
