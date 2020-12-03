package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int height;

    public Rectangle(int length, int height, Color color) {
        super(color);
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int showLength() {
        return length;
    }

    @Override
    public double countArea() {
        return height * length;
    }

    @Override
    public String drawFigure() {
        return "Figure: rectangle, area: " + countArea() + " sq. units, length "
                + showLength() + ", color: " + getColor().name().toLowerCase();
    }
}
