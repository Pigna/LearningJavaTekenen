/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.javafx;

import drawing.domain.IPaintable;
import drawing.domain.Image;
import drawing.domain.Oval;
import drawing.domain.PaintedText;
import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author myron
 */
public abstract class JavaFXPaintable implements IPaintable {

    @Override
    public void setColor(Color color) {
        
    }

    @Override
    public void paintOval(Oval oval) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paintLine(Point from, Point to, int weight) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paintText(PaintedText text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paintImage(Image image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
