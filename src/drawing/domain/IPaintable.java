/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.domain;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author myron
 */
public interface IPaintable {
    void setColor(Color color);
    void paintOval(Oval oval);
    void paintLine(Point from, Point to, int weight);
    void paintText(PaintedText text);
    void paintImage(Image image);
    void clear();
}
