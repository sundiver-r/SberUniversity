public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("«Основы программирования»");
        Course course2 = new Course("«Объектно-ориентированное программирование»");

        course1.addStudent("Петр Иванович Н.");
        course1.addStudent("Борис Сергеевич П.");
        course1.addStudent("Анна Дмитриевна К.");

        course2.addStudent("Петр Иванович Н.");
        course2.addStudent("Анна Сергеевна Д.");

        System.out.println("Количество студентов по дисциплине\n"
                + course1.getCourseName() + ": " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");

        course1.dropStudent("Борис Сергеевич П.");

        System.out.println("Количество студентов по дисциплине\n"
                + course1.getCourseName() + ": " + course1.getNumberOfStudents());
        String[] studentsAfterDrop = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            if (i < course1.getNumberOfStudents() - 1) {
                System.out.print(students[i] + ", ");
            } else {
                System.out.print(students[i]);
            }

        System.out.println();
        System.out.print("Количество студентов по дисциплине\n"
                + course2.getCourseName() + ": " + course2.getNumberOfStudents());
    }
}
