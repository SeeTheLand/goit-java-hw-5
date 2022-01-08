class LevelTest {
    public static void main(String[] args) {
        LevelOld.Point p1 = new LevelOld.Point(3, 5);
        LevelOld.Point p2 = new LevelOld.Point(10, 100);
        LevelOld.Point p3 = new LevelOld.Point(50, 40);

        LevelOld.Point[] points = {p1, p2, p3};

        LevelOld.LevelInfo info = new LevelOld.LevelInfo("Quarke Intro", "Easy");

        //3015
        System.out.println(new LevelOld(info, points).calculateLevelHash());
    }
}

class LevelOld {
    private LevelInfo levelInfo;
    private Point[] points;

    public LevelOld(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    @Override
    public int hashCode() {
        int sum = 0;
        for (Point point : points) {
            sum += (point.x * point.y);
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelInfo.getName() + ", difficulty is " + levelInfo.getDifficulty() + ", point count is " + points.length;
    }

    static class LevelInfo {
        private String name;
        private String difficulty;

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public void setDifficulty(String difficulty) {
            this.difficulty = difficulty;
        }
    }

    static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public int calculateLevelHash() {
        return hashCode();
    }
}