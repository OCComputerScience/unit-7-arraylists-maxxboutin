package BinarySearch;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {

        ArrayList<Integer> sortedNumbers = new ArrayList<>(Arrays.asList(
                1, 9, 16, 22, 24, 30, 34, 39, 41, 47,
                51, 58, 61, 65, 68, 71, 74, 75, 76, 77,
                78, 81, 85, 88, 89
        ));

        int [] arr = {3, 6, 17, 19, };

        binarySearch(sortedNumbers, 3);

    }

    public static int binarySearch(ArrayList<Integer> sortedNumbers, int numToFind)
    {

        int left = 0;
        int right = sortedNumbers.size() - 1;



        while (left <= right)
        {

            //current middle index
            int midIndex = left + (left + right) / 2;

            //current middle value
            int current = sortedNumbers.get(midIndex);

            if (current == numToFind)
            {
                return midIndex;
            }

            else if (current > numToFind)
            {
                left = midIndex - 1;
            }

            else
            {

                left = midIndex + 1;

            }

        }

        return -1;

    }
}
