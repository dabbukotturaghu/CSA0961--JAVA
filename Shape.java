abstract class Shape {
    // Abstract methods to calculate area and volume
    abstract double calculateArea();
    abstract double calculateVolume();
}


class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}


class Cone extends Shape {
    private double radius;
    private double height;


    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    double calculateArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double calculateArea() {
        return 2 * Math.PI * radius * (height + radius);
    }

    double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        Cone cone = new Cone(3, 7);
        Cylinder cylinder = new Cylinder(4, 10);

        System.out.println("Area and Volume calculations:");
        System.out.println("Sphere - Radius: 5");
        System.out.println("Area: " + sphere.calculateArea());
        System.out.println("Volume: " + sphere.calculateVolume());
        System.out.println();

        System.out.println("Cone - Radius: 3, Height: 7");
        System.out.println("Area: " + cone.calculateArea());
        System.out.println("Volume: " + cone.calculateVolume());
        System.out.println();

        System.out.println("Cylinder - Radius: 4, Height: 10");
        System.out.println("Area: " + cylinder.calculateArea());
        System.out.println("Volume: " + cylinder.calculateVolume());
    }
}
