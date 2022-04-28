package se.Kattis.elmira;

public class NumberOfTinesOfMoos {
    /**
     * Age of the bull moose from number of tines.
     *
     * @author elmiramadadi
     */
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

