package se.Kattis.elmira;

import java.util.*;

public class SortNames {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            // Add each line as a Student to the students list
            students.add(new Student(scanner.next(), scanner.next()));
            scanner.nextLine();
        }
        scanner.close();
        // Sort first by last name and then by first name
        Collections.sort(students, new Student.StudentSortingComparator());
        // Check if two or more people have the same last name
        for (int i = 0; i < students.size() - 1; i++) {
            if (students.get(i).getLastName().equals(students.get(i + 1).getLastName())) {
                if (!students.get(i).getFirstName().equals(students.get(i + 1).getFirstName())) {
                    students.get(i).setSameLastName(true);
                    students.get(i + 1).setSameLastName(true);
                }
            }
        }
        for (Student student : students) {
            if (student.isSameLastName()) {
                System.out.println(student.getFirstName());
            } else {
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
        }
    }
    static class Student {
        String firstName;
        String lastName;
        boolean sameLastName;
        boolean sameFirstName;

        public Student(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setSameLastName(boolean sameLastName) {
            this.sameLastName = sameLastName;
        }

        public boolean isSameLastName() {
            return sameLastName;
        }

        public void setSameFirstName(boolean sameFirstName) {
            this.sameFirstName = sameFirstName;
        }

        public boolean isSameFirstName() {
            return sameFirstName;
        }

        // Helper class implementing Comparator
        static class StudentSortingComparator implements Comparator<Student> {

            // Compare Student first by last name then by first name
            @Override
            public int compare(Student student1, Student student2) {
                int lastNameCompare = student1.getLastName().compareTo(student2.getLastName());
                int firstNameCompare = student1.getFirstName().compareTo(student2.getFirstName());
                return (lastNameCompare == 0 ? firstNameCompare : lastNameCompare);
            }
        }
    }
}

