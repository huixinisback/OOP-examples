
public class L3E2_DistBetween2Points {
    public static void main(String[] args) {
        TwoDPoint point1 = new TwoDPoint(); // will refer to the no args constructor already set 0,0
        //this will set 3 and 4 for the coordinates
        TwoDPoint point2 = new TwoDPoint(3, 4); // will pass the value in

        System.out.println("Point 1 coordinates: (" + point1.getX() + ", " + point1.getY() + ")");
        //this will get 3 and 4 from the coordiantes in this class
        System.out.println("Point 2 coordinates: (" + point2.getX() + ", " + point2.getY() + ")");

        //point 2 is the "remote point" being passed into the get distance
        System.out.println("Distance between point 1 and point 2: " + point1.getDistance(point2));
    }
}