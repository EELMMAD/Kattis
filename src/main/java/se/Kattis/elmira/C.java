package se.Kattis.elmira;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {

       // String[] elements = {"#", "8", "2", "4", "4", "3"};
       // String elements = "# 8 2 4 4 3";
       // String[] elements = {".", "1", "2", "4", "2", "2", "2", "6", "1", "1"};

      //  convertImage("# 8 2 4 4 3");


        Scanner scanner = new Scanner(System.in);

        List<String> elements = new ArrayList<>();

        while (scanner.hasNextLine()) {
            int number = scanner.nextInt();
            scanner.nextLine();
            do {
                elements.add(scanner.nextLine());
                number--;
            } while (number != 0);
            //
            System.out.println(elements);
    }
    }

    public static void convertImage(String string){
        if (string.charAt(0) == '#') {
            for (int i = 2; i < string.length(); i+=2) {
                int b = i / 2;
                if ((b % 2) != 0) {
                    int a = Character.getNumericValue(string.charAt(i));
                    for (int j = 1; j <= a; j++) {
                        System.out.print("#");
                    }
                } else {
                    int a =  Character.getNumericValue(string.charAt(i));
                    for (int j = 1; j <= a; j++) {
                        System.out.print(".");
                    }
                }
            }
        } else {
            for (int i = 2; i < string.length(); i+=2) {
                int b = i /2;
                if ((b % 2) != 0) {
                    int a =Character.getNumericValue(string.charAt(i));
                    for (int j = 1; j <= a; j++) {
                        System.out.print(".");
                    }
                } else {
                    int a = Character.getNumericValue(string.charAt(i));
                    for (int j = 1; j <= a; j++) {
                        System.out.print("#");
                    }
                }
            }
        }
    }
}
