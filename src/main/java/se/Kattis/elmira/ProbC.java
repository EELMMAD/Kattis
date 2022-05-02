package se.Kattis.elmira;

import java.util.*;

public class ProbC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> elements = new ArrayList<>();
        while (scanner.hasNextLine()) {
            int number = scanner.nextInt();
            scanner.nextLine();
           // System.out.println();  //1
            do {
                elements.add(scanner.nextLine());
                number--;
            } while (number != 0);
            System.out.println(); //****
            for (String element : elements) {
                String[] x = element.split(" ");
                convertImage(x);
            }
            elements.clear();
        }
    }

    public static void convertImage(String[] stringArray) {
        if (stringArray[0].equals("#")) {
            for (int i = 1; i < stringArray.length; i++) {
                if ((i % 2) != 0) {
                    int a = Integer.parseInt(stringArray[i]);
                    for (int j = 1; j <= a; j++) {
                        System.out.print("#");
                    }
                } else {
                    int a = Integer.parseInt(stringArray[i]);
                    for (int j = 1; j <= a; j++) {
                        System.out.print(".");
                    }
                }
            }
            System.out.println(); //3
        } else if (stringArray[0].equals(".")) {
            for (int i = 1; i < stringArray.length; i++) {
                if ((i % 2) != 0) {
                    int a = Integer.parseInt(stringArray[i]);
                    for (int j = 1; j <= a; j++) {
                        System.out.print(".");
                    }
                } else {
                    int a = Integer.parseInt(stringArray[i]);
                    for (int j = 1; j <= a; j++) {
                        System.out.print("#");
                    }
                }
            }
            System.out.println(); //4
        }
    }
}







