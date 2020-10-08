import java.util.Scanner;

abstract class Processor {
    int data;

    abstract void process();

    void showData() {
        System.out.println(" " + data);
    }
}

class Factorial extends Processor {
    void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No for factorial : ");
        int f = sc.nextInt();
        int fact = 1;
        for (int i = 2; i <= f; i++) {
            fact = fact * i;
        }
        System.out.print("Factorial of " + f + " : ");
        data = fact;
        sc.close();
    }
}

class Circle extends Processor {
    void process() {
        System.out.print("Area of Circle : ");
        int r = 5;
        double area = 3.14 * r * r;
        data = (int) area;
    }
}

class Ques48 {
    public static void main(String[] args) {
        Processor p = new Factorial();
        p.process();
        p.showData();

        Processor p1 = new Circle();
        p1.process();
        p1.showData();
    }
}
