package homework;

import java.util.List;
import java.util.Objects;

public class Student {
    private final String name;
    private final int grade;
    private boolean equals;

    public Student(String token, String name, int grade) {
        this.name = name;

        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student that = (Student) o;
        boolean equals = false;
        return grade == that.grade &&
                equals == that.equals &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade, equals);
    }

    public List<Student> readFile(String s) {
    }
}