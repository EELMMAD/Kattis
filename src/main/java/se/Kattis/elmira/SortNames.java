package se.Kattis.elmira;

import java.util.*;

public class SortNames {

    /*
        public static void main(String[] args) {
            List<Students> students = new ArrayList<Students>();


            Collections.sort(students, new Comparator<Students>() {
                @Override
                public int compare(Students o1, Students o2) {
                    int res =  o1.getFirstName().compareToIgnoreCase(o2.getLastName());
                    if (res != 0)
                        return res;
                    return o1.getFirstName().compareToIgnoreCase(o2.getLastName());
                }
            });
            students.add(0, new Students("Will", "Smith"));
            students.add(1, new Students("Agent", "Smith"));
            students.add(2, new Students("Peter", "Pan"));
            students.add(3, new Students("Micky", "Mouse"));
            students.add(4, new Students("Minnie", "Mouse"));
            students.add(5, new Students("Peter", "Gunn"));
        }


    /*
    List<PlayerStats> playerList = new ArrayList<PlayerStats>();


public static void sortPlayers(List<PlayerStats> playerList) {
   Collections.sort(playerList, new Comparator<PlayerStats>() {
       public int compare(PlayerStats p1, PlayerStats p2) {
            int res =  p1.getPlayerLastName().compareToIgnoreCase(p2.getPlayerLastName());
            if (res != 0)
                return res;
            return p1.getPlayerFirstName().compareToIgnoreCase(p2.getPlayerFirstName())
       }
   });
}
     */

    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<Students>();
// adding elements to the ArrayList
        students.add(0, new Students("Will", "Smith"));
        students.add(1, new Students("Agent", "Smith"));
        students.add(2, new Students("Peter", "Pan"));
        students.add(3, new Students("Micky", "Mouse"));
        students.add(4, new Students("Minnie", "Mouse"));
        students.add(5, new Students("Peter", "Gunn"));

        System.out.println();
// printing the unsorted ArrayList
        System.out.println("Before Sorting: " + students);
// Sorting ArrayList in ascending Order
        Collections.sort(students, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                int res = o1.getFirstName().compareToIgnoreCase(o2.getLastName());
                if (res != 0)
                    return res;
                return o1.getFirstName().compareToIgnoreCase(o2.getLastName());
            }
        });
// printing the sorted ArrayList
        System.out.println("After Sorting: " + students);
    }
}


class Students {

    String firstName;
    String lastName;

    public Students(String firstName, String lastNAme) {
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
        Students students = (Students) o;
        return Objects.equals(firstName, students.firstName) && Objects.equals(lastName, students.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}

