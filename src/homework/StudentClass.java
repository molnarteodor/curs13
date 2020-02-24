package homework;

import java.util.List;
import java.util.Scanner;

public class StudentClass {
    public StudentClass(String name, int grade) {
    }

    public List<Student> readFile(String fileLocation) {
        Scanner scanner = new Scanner(fileLocation);
        while (scanner.hasNextLine()) {
            fetchStudentGrade(scanner.nextLine());
            System.out.println(scanner.nextLine());
        }
        return List.of();
    }

    private void fetchStudentGrade(String nextLine) {
    }

}
