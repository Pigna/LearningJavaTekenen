package drawing.domain;

import java.awt.*;
import java.io.File;
/**
 *
 * @author myron
 */
public class Image extends DrawingItem {
    private File file;
    private double size;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Image(Point anchor, Color color, File file, double size) {
        super(anchor, color);
        this.file = file;
        this.size = size;
    }
    void Paint(IPaintable paint){
        paint.paintImage(this);
    }
}
