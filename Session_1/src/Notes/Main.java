package Notes;

public class Main
{

    public static void main(String[] args)
    {

        int[] array = {64, 34, 25, 12, 22, 11, 90};

    }

    public static void selectionSort(int[] array)
    {

        for (int i = 0; i < array.length - 1; i++)
        {

            int lowestIndex = i;

            for (int j = i + 1; j < array.length; j++)
            {

                if (array[lowestIndex] > array[j])
                {

                    lowestIndex = j;

                }

                SwapElements(array, i, lowestIndex);
            }

        }

    }

    private static void SwapElements(int[] array, int a, int b) {
        //swap elements
        int temp;
        temp = a;
        array[a] = array[b];
        array[b] = temp;
    }

    public static void printArray(int[] array)
    {

    }

}