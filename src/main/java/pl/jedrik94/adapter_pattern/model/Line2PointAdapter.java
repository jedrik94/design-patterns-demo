package pl.jedrik94.adapter_pattern.model;

import java.util.*;
import java.util.function.Consumer;

public class Line2PointAdapter implements Iterable<Point> {
    private static int count;
    private static Map<Integer, List<Point>> cache = new HashMap<>();
    private int hash;

    public Line2PointAdapter(Line line) {
        hash = line.hashCode();
        if (cache.get(hash) != null) return;

        System.out.println(
                String.format("%d: Generating points for line [%d, %d] - [%d, %d] (with caching)",
                        ++count, line.getStart().getX(), line.getStart().getY(), line.getEnd().getX(), line.getEnd().getY()));

        ArrayList<Point> points = new ArrayList<>();

        int left = Math.min(line.getStart().getX(), line.getEnd().getX());
        int right = Math.max(line.getStart().getX(), line.getEnd().getX());
        int top = Math.min(line.getStart().getY(), line.getEnd().getY());
        int bottom = Math.max(line.getStart().getY(), line.getEnd().getY());
        int dx = right - left;
        int dy = top - bottom;

        if (dx == 0) {
            for (int y = top; y <= bottom; ++y) {
                points.add(new Point(left, y));
            }
        } else if (dy == 0) {
            for (int x = left; x <= right; ++x) {
                points.add(new Point(x, top));
            }
        }

        cache.put(hash, points);
    }

    @Override
    public Iterator<Point> iterator() {
        return cache.get(hash).iterator();
    }

    @Override
    public void forEach(Consumer<? super Point> action) {
        cache.get(hash).forEach(action);
    }

    @Override
    public Spliterator<Point> spliterator() {
        return cache.get(hash).spliterator();
    }
}
