public class Rectangle {
    private int length;
    private int width;
    private int bottomLeftX;
    private int bottomLeftY;
 
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int newLength) {
        this.length = newLength;
    }

    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    public int bottomLeftX() {
        return length;
    }

    public int bottomLeftY() {
        return width;
    }

    public void setBottomLeftX(int newX) {
        this.bottomLeftX = newX;
    }

    public void setBottomLeftY(int newY) {
        this.bottomLeftY = newY;
    }

    public Rectangle(int newLength, int newWidth) {

        this.length = newLength;
        this.width = newWidth;
    }

    public int getArea() {
        return this.length * this.width;
    }

    public int getPerimeter() {
        return (2 * length + 2 * width);
    }

    public Rectangle() {
        this.length = 10;
        this.width = 10;
    }

    public void rotate() {
        int m = length;
        this.length = width;
        this.width = m;
    }

    public String toString() {
        return "Rectangle: " + length + " x " + width;
    }

    public void moveRect(int deltaX, int deltaY) {
        this.setBottomLeftX(bottomLeftX + deltaX);
        this.setBottomLeftY(bottomLeftY + deltaY);
    }

    public double getDiagonal() {
        double dia = Math.sqrt(((this.length) * (this.length))
            + ((this.width) * (this.width)));
        return dia;
    }

    public boolean equals(Rectangle anotherRectangle) {
        if (this.length == anotherRectangle.length 
            && this.width == anotherRectangle.width) {
            return true;
        } else {
            return false;
        }
    }

    public int calculateArea() {
        return (this.length * this.width);
    }
}
    

