class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}

class RectangleArea {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public RectangleArea(int[] coords) {
        x1 = coords[0];
        y1 = coords[1];
        x2 = coords[2];
        y2 = coords[3];
    }

    public int getArea() {
        int a = Math.abs(y2-y1);
        int b = Math.abs(x2 - x1);
        return a * b;
    }
}