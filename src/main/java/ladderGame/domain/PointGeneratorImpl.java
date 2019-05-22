package ladderGame.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PointGeneratorImpl implements PointGenerator {

    private static PointGeneratorImpl instance;

    private PointGeneratorImpl() {
    }

    public static PointGeneratorImpl getInstance() {
        if (instance == null) {
            instance = new PointGeneratorImpl();
        }
        return instance;
    }

    @Override
    public List<Point> makePointList(int width) {
        List<Point> points = new ArrayList<>();

        points.add(Point.pointFirst(makeBoolean()));
        for (int i = 1; i < width - 1; i++) {
            Point prePoint = points.get(points.size() - 1);
            points.add(prePoint.nextPoint(makeBoolean()));
        }
        points.add(points.get(points.size() - 1).nextPointLast());

        return points;
    }

    private boolean makeBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}