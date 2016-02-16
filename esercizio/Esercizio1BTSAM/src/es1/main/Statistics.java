package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Statistics{
    public double perimeter;
    public double area;
    public Statistics(double perimeter, double area) {

        this.perimeter=perimeter;
        this.area=area;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public void add(Statistics s) {
        setArea(getArea()+s.area);
        setPerimeter(getPerimeter()+s.perimeter);

    }






}