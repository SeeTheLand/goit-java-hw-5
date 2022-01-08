import java.util.Arrays;

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}

class TargetFinder {
    private int[] aiCoords;
    private int[][] targets;

    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int cathetusOne;
        int catherusTwo;
        int distance = Integer.MAX_VALUE;
        int[] closestPoint = new int[2];
        for (int i = 0; i < targets.length; i++) {
            int calculatedDistance = getDistance(aiCoords[0], aiCoords[1], targets[i][0], targets[i][1]);
            if (calculatedDistance < distance) {
                closestPoint = targets[i];
                distance = calculatedDistance;
            }
        }
        return closestPoint;
    }

    public int getDistance(int x1, int y1, int x2, int y2) {
        int a = Math.abs(y2 - y1);
        int b = Math.abs(x2 - x1);

        return (int) Math.hypot(a, b);
    }
}