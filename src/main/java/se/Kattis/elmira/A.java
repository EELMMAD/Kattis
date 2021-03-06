package se.Kattis.elmira;

import java.util.*;

public class A {

    public static void main(String[] args) {
        List<Studentsss> students = new ArrayList<Studentsss>();

        students.add(0, new Studentsss("Will", "Smith"));
        students.add(1, new Studentsss("Agent", "Smith"));
        students.add(2, new Studentsss("Peter", "Pan"));
        students.add(3, new Studentsss("Micky", "Mouse"));
        students.add(4, new Studentsss("Minnie", "Mouse"));
        students.add(5, new Studentsss("Peter", "Gunn"));

        Collections.sort(students, new Comparator<Studentsss>() {
            @Override
            public int compare(Studentsss o1, Studentsss o2) {
                int res =  o1.getFirstName().compareToIgnoreCase(o2.getLastName());
                if (res != 0)
                    return res;
                return o1.getFirstName().compareToIgnoreCase(o2.getLastName());
            }
        });

        Comparator<Studentsss> firstNameSorter = (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName());
        Comparator<Studentsss> lastNameSorter = (o1, o2) -> o1.getLastName().compareTo(o2.getLastName());

        Comparator<Studentsss> fullNameSorter = firstNameSorter.thenComparing(lastNameSorter);

        System.out.println(fullNameSorter);

    }
}


class Studentsss {

    String firstName;
    String lastName;

    public Studentsss(String firstName, String lastNAme) {
        this.firstName = firstName;
        this.lastName = lastNAme;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studentsss students = (Studentsss) o;
        return Objects.equals(firstName, students.firstName) && Objects.equals(lastName, students.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}


class FirstNameSorter implements Comparator<Studentsss> {

    @Override
    public int compare(Studentsss o1, Studentsss o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }


}

