/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.domain;

import java.awt.*;
/**
 *
 * @author myron
 */
public abstract class DrawingItem implements Comparable{
    private Point anchor;
    private Color color;
    public DrawingItem previousState;

    public DrawingItem(Point anchor, Color color) {
        this.anchor = anchor;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        ChangeObject();
        this.color = color;
    }

    public Point getAnchor() {
        return anchor;
    }

    public void setAnchor(Point anchor) {
        ChangeObject();
        this.anchor = anchor;
    }

    public DrawingItem getPreviousState() { return previousState; }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
    public void ChangeObject(){
        this.previousState = this;
    }
    public void ReturnToPreviousState(){
        this.anchor = previousState.anchor;
        this.color = previousState.color;
        this.previousState = previousState.previousState;
    }
    public void paint(IPaintable paintable){
        
    }
}