package ListMethods;

import java.util.ArrayList;

public class Student
{

    private String name;
    private int grade;

    static ArrayList<String> students = new ArrayList<>();

    public Student(String name, int grade) {

        String nameList = name;
        int gradeList = grade;

        students.add(nameList);
        students.add(String.valueOf(gradeList));

    }

    public static void printClassList() {

        for (String studentNames : students) {System.out.println(studentNames);}

    }

    public static String getLastStudent() {return students.getLast();}

    public static void addStudent(int index, Student student)
    {



    }

}