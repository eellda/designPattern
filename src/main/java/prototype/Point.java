package prototype;

public class Point implements Shape, Prototype {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public Object copy() {
        Point newPoint = new Point();

        newPoint.x = this.x;
        newPoint.y = this.y;

        return newPoint;
    }

    @Override
    public String draw() {
        return "(" + x + " " + y + ")";
    }

    @Override
    public void moveOffset(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}
