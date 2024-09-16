package mypath;

//        +----------------------------------+
//        |          Rectangle               |
//        +----------------------------------+
//        | - width: double                  |
//        | - height: double                 |
//        |----------------------------------|
//        | + Rectangle()                    |
//        | + Rectangle(width: double, height: double) |
//        | + getArea(): double              |
//        | + getPerimeter(): double         |
//        +----------------------------------+

public class Rectangle {
    double width;
    double height;

    Rectangle() {
        width = -1;
        height = -1;
    }

    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    double getArea() {
        return height * width;
    }

    double getPerimeter() {
        return 2 * (height + width);
    }
}

