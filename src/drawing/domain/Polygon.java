/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.domain;

import java.awt.*;
import java.util.Arrays;
/**
 *
 * @author myron
 */
public class Polygon extends DrawingItem{
    private int weight;
    private Point[] vertices;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Point[] getVertices() {
        return vertices;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "weight=" + weight +
                ", vertices=" + Arrays.toString(vertices) +
                '}';
    }
    public Polygon(int weight, Point[] vertices, Point anchor, Color color) {
        super(anchor, color);
        this.weight = weight;
        this.vertices = vertices;
    }
}
