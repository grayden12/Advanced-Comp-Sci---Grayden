public class Line {
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateSlope() {
        return (((double) -a) / b);
    }

    public Boolean isCoordinateOnLine(int x, int y) {
        if (this.a * x + this.b * y + c == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Equation: " + a + "x + " 
            + b + "y +  " + c;
    }

    public boolean equals(Line anotherLine) {
        if (this.a == anotherLine.a 
            && this.b == anotherLine.b
            && this.c == anotherLine.c) {
            return true;
        } else {
            return false;
        }
    }

}
