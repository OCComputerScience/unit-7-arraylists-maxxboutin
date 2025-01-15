package ClassList;

import java.util.ArrayList;

public class Student
{

    static ArrayList<String> students = new ArrayList<>();

    public Student (String name, int grade)
    {

        String nameList = name;

        int gradeList = grade;

        students.add(nameList);
        students.add(String.valueOf(gradeList));

    }

    public static void printClassList ()
    {

        for (String studentNames : students)
        {

            System.out.println(studentNames);

        }

    }



}