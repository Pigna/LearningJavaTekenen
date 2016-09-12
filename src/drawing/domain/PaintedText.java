package drawing.domain;

import java.awt.*;
/**
 *
 * @author myron
 */
public class PaintedText extends DrawingItem{
    private String content;
    private Font font;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public PaintedText(Point anchor, Color color, String content, Font font) {
        super(anchor, color);
        this.content = content;
        this.font = font;
    }
    void Paint(IPaintable paint){
        paint.paintText(this);
    }
}
