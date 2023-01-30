  public class Course {
        private String courseName;
        private String[] students = new String[100];
        private int numberOfStudents;

        public Course(String courseName) {
            this.courseName = courseName;
        }

        public void addStudent(String student) {
            if(numberOfStudents < students.length) {
                students[numberOfStudents] = student;
                numberOfStudents++;
            } else {
                String[] tempStudents = new String[numberOfStudents + 1];
                System.arraycopy(students, 0, tempStudents, 0, students.length);
                tempStudents[numberOfStudents] = student;
                System.arraycopy(tempStudents, 0, students, 0, tempStudents.length);
                numberOfStudents++;
            }
        }

        public String[] getStudents() {
            String[] studentsShort = new String[numberOfStudents];
            System.arraycopy(students, 0, studentsShort, 0, numberOfStudents);
            return studentsShort;
        }

        public int getNumberOfStudents() {
            return numberOfStudents;
        }

        public String getCourseName() {
            return courseName;
        }

        public void dropStudent(String student) {
            int i = 0;
            for (int j = 0; j < students.length; j++) {
                if (students[j].equals(student)) {
                    i = j;
                    break;
                }
            }
            String[] tempStudents = new String[students.length - 1];
            System.arraycopy(students, 0, tempStudents, 0, i + 1);
            System.arraycopy(students, i + 1, tempStudents, i, students.length - i - 1);
            students = tempStudents;
            numberOfStudents--;
        }

        public void clear() {
            for(int i = 0; i < numberOfStudents; i++) {
                students[i] = null;
            }
            numberOfStudents = 0;
        }
    }
