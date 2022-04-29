package se.Kattis.elmira;

public class Main {
    public static void main(String[] args) {
        numberOfTines(3, 3);
        numberOfTines(2, 3);
        numberOfTines(0, 0);
    }
    public static void numberOfTines(int l, int r){
        if (l == 0 && r == 0) {
            System.out.println("Not a moose");
        }
        else if (l > r){
            System.out.println("Odd " + (l * 2));
        }else if(l < r){

            System.out.println("Odd " + (r * 2));
        }else {
            System.out.println("Even " + l * 2);
        }
    }
}
