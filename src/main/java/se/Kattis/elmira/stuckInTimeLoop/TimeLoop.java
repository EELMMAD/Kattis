package se.Kattis.elmira.stuckInTimeLoop;

import java.util.Scanner;

public class TimeLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int line = 1;
        String myStr = "Abracadabra";
        for(int counter=0; counter < input; counter++)
            System.out.println(line++ + " " + myStr);
    }
}
