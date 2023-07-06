package prototype;

public class Line implements Shape, Prototype {
    private Point startPt;
    private Point endPt;

    public Point getStartPt() {
        return startPt;
    }

    public void setStartPt(Point startPt) {
        this.startPt = startPt;
    }

    public Point getEndPt() {
        return endPt;
    }

    public void setEndPt(Point endPt) {
        this.endPt = endPt;
    }

    @Override
    public Object copy() {
        Line newLine = new Line();

        // 복사본 객체 / 원본 변경 x
        newLine.startPt = (Point) startPt.copy();
        newLine.endPt = (Point) endPt.copy();

        return newLine;
    }

    @Override
    public String draw() {
        return "Line(" + startPt.draw() + " " + endPt.draw() + ")";
    }

    @Override
    public void moveOffset(int dx, int dy) {
        startPt.moveOffset(dx, dy);
        endPt.moveOffset(dx, dy);
    }
}
