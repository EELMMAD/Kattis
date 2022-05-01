package se.Kattis.elmira;
public class Rectangle {
    public static void main(String[] args) {

        Point alicePoint1 = new Point(2, 3);
        Point alicePoint2 = new Point(10, 11);

        Point tedPoint1 = new Point(7, 2);
        Point tedPoint2 = new Point(18, 8);

        Point greedPoint1 = new Point(17, 11);
        Point greedPoint2 = new Point(30, 24);


        int total = calculateArea(33, 26);
        System.out.println("Total " + total);

       // System.out.println(hasOverlap(alicePoint1, alicePoint2, tedPoint1, tedPoint2)); //true
       // System.out.println(hasOverlap(alicePoint1, alicePoint2, greedPoint1, greedPoint2)); //false
       // System.out.println(hasOverlap(tedPoint1, alicePoint2, greedPoint1, greedPoint2)); //false


        int contested = overlappingArea(alicePoint1, alicePoint2, tedPoint1, tedPoint2);
        System.out.println("Contested " + contested);

        int aliceArea = calculateArea(alicePoint1, alicePoint2);
        int alicePure = (aliceArea - contested);
        System.out.println("Alice " + alicePure);

        int tedArea = calculateArea(tedPoint1, tedPoint2);
        int tedPure =  (tedArea - contested);
        System.out.println("Ted " + tedPure);


        int greedArea = calculateArea(greedPoint1, greedPoint2);
        System.out.println("GreedyBob " + greedArea);


        int unallocated = total - (alicePure + tedPure + contested + greedArea);
        System.out.println("Unallocated " + unallocated);

    }

    public static int calculateArea(double l, double w) {
        int totalArea = (int) Math.abs(l * w);
        return totalArea;
    }


    public static int calculateArea(Point p1, Point p2) {
        int area = (p2.x - p1.x) * (p2.y - p1.y);
       // System.out.println(area);
        return area;
    }


    // Returns Total Area of two overlap
    static int overlappingArea(Point l1, Point r1,
                               Point l2, Point r2) {
        // Area of 1st Rectangle
        int area1 = calculateArea(l1, r1);

        // Area of 2nd Rectangle
        int area2 = calculateArea(l2, r2);

        // start from max(l1.x, l2.x) of x-coordinate and end at min(r1.x,r2.x) x-coordinate by
        // subtracting start from end we get required lengths
        int x_dist = (Math.min(r1.x, r2.x) - Math.max(l1.x, l2.x));
        // System.out.println("x_dist " + x_dist);

        int y_dist = (Math.min(r1.y, r2.y) - Math.max(l1.y, l2.y));
        //  System.out.println("y_dist " + y_dist);

        int areaI = 0;
        if (x_dist > 0 && y_dist > 0) {
            areaI = x_dist * y_dist;
        }
        return areaI;
    }

    public static boolean hasOverlap(Point l1, Point r1, Point l2, Point r2) {

        int overLapAmount = overlappingArea(l1, r1, l2, r2);

        if (overLapAmount > 0) {
            return true;
        }
        return false;
    }
}

class Point {
    int x, y;

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
