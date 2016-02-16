package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Square extends Shape {


        public double side;


        public Square(double side) {this.side =side;}

        @Override
        public double area() {return side*side;        }

        @Override
        public double perimeter() { return 4 *side;}
        }

