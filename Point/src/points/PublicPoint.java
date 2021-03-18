package points;

public class PublicPoint {
    public int x, y;

    public PublicPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
