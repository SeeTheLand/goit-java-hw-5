class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(-8, -6, 5, 3, -6, 4));

    }
}

class CircleIntersector {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int r1;
    private int r2;

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.r1 = r1;
        this.r2 = r2;

    }

    public int getDistance() {
        int a = Math.abs(y2 - y1);
        int b = Math.abs(x2 - x1);

        return (int) Math.hypot(a, b);
    }

    @Override
    public String toString() {
        if (getDistance() > (r1 + r2)) {
            return "not intersects";
        } else {
            return "intersects";
        }
    }
}