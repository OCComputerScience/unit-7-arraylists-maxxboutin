package FantasyFootball;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> availablePlayers = new ArrayList<String>();
        addPlayers(availablePlayers);
        selectPlayer(availablePlayers);
    }

    public static void addPlayers(ArrayList<String> array)
    {
        array.add("Frodo");
        array.add("Gandalf");
        array.add("Aragorn");
        array.add("Legolas");
        array.add("Gimli");
        array.add("Samwise");
        array.add("Bilbo");
        array.add("Gollum");
        array.add("Thorin");
        array.add("Balin");
        array.add("Galadriel");
        array.add("Elrond");
        array.add("Sauron");
        array.add("Melkor");
        array.add("Lúthien");
    }

    public static void selectPlayer (ArrayList<String> array)
    {

        ArrayList<String> takenPlayers = new ArrayList<String>();

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter name of player to add:");

            Scanner userInputScanner = new Scanner(System.in);

            String userInput = userInputScanner.nextLine();

            array.remove(userInput);
            takenPlayers.add(userInput);

            for (String takenPlayer : takenPlayers)
            {
                if (takenPlayer.equals(userInput))
                {
                    i--;
                    System.out.println(userInput + " is not available player.");
                }
            }
        }

        System.out.println("Final Team Roster:");

        for (String loop : takenPlayers)
        {
            System.out.println(loop);
        }

    }
}
