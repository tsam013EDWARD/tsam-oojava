package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
class Circle extends Shape {
    public int radD;
    double pi = Math.PI;

    public Circle() {
        this(1);
    }
    public Circle(double radD) {this.radD = radius;}


    @Override
    public double area() { return pi * Math.pow(radD, 2);}

    public double perimeter() { return 2 * pi * radD; }

}
