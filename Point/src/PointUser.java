import points.PublicPoint;

public class PointUser {

    public static void main(String[] args) {
        PublicPoint p = new PublicPoint(2, 3);
        System.out.println(p.x + " " + p.y);
    }
}
