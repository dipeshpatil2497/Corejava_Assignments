import java.util.*;

class Circle {
    private int radius;
    private double area;
    private float pi = 3.14f;

    void init(int radius) {
        this.radius = radius;
        calculatearea();
    }

    void calculatearea() {
        area = pi * radius * radius;
    }

    void display() {
        System.out.println("Area : " + area);
    }

}

class Ques34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        System.out.println("Enter radius : ");
        int radius = sc.nextInt();
        c1.init(radius);
        c1.display();
        sc.close();
    }
}
