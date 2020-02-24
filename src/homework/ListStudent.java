package homework;

import java.util.List;

public class ListStudent {
    public static void main(String[] args) throws Exception {
        String name = null;
        int grade = 0;
        StudentClass reader = new StudentClass(name, grade);
        List<Student> students = reader.readFile("grades.txt");
        System.out.println(students);
    }
}
