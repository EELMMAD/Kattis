package se.Kattis.elmira;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProblemC {
    public static void main(String[] args) {
        //Creating an array list

        //Check the first element of each row
        //if the first element is # -> print #
        //if the second element is # -> print .
        //iterate throw  each row from index i = 1;
        // for odd elements -> if elements[0] is # -> then print  elements[1] times elements[0] content (#)
        // for even elements -> if elements[0] is . -> then print  elements[1] times elements[0] content (.)

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



            for(int i = 0; i < elements.size(); i++){
               // System.out.println(elements.get(i));
                convertImage(elements.get(i));
            }
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
                System.out.println();

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
                System.out.println();
            }















            //_________________________















            /*
            if (elements.get(0).equals("#")) {
                for (int i = 1; i < elements.size(); i++) {
                    if ((i % 2) != 0) {
                        int a = Integer.parseInt(elements.get(i));
                        for (int j = 1; j <= a; j++) {
                            System.out.print("#");
                        }
                    } else {
                        int a = Integer.parseInt(elements.get(i));
                        for (int j = 1; j <= a; j++) {
                            System.out.print(".");
                        }
                    }
                }
            } else {
                for (int i = 1; i < elements.size(); i++) {
                    if ((i % 2) != 0) {
                        int a = Integer.parseInt(elements.get(i));
                        for (int j = 1; j <= a; j++) {
                            System.out.print(".");
                        }
                    } else {
                        int a = Integer.parseInt(elements.get(i));
                        for (int j = 1; j <= a; j++) {
                            System.out.print("#");
                        }
                    }
                }
            }

             */


        }



        }





