package drawing.domain;

import java.awt.*;
/**
 *
 * @author myron
 */
public class Spline extends DrawingItem{
    private Point[] points;
    private int weight;
    private int degree;

    public Point[] getPoints() {
        return points;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public Spline(Point anchor, Color color, Point[] points, int weight, int degree) {
        super(anchor, color);
        this.points = points;
        this.weight = weight;
        this.degree = degree;
    }
}
