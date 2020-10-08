class MathOperation36 {

    void multiply(int a, int b) {
        System.out.println("Two int " + a + " and " + b + " multiply : " + a * b);
    }

    void multiply(float a, float b, float c) {
        double res = a * b * c;
        System.out.println("Three float " + a + ", " + b + " and " + c + " multiply : " + res);
    }

    void multiply(int a[]) {
        int res = 1;
        for (int i = 0; i < a.length; i++) {
            res = res * a[i];
        }
        System.out.print("Array : ");
        for (int arr : a) {
            System.out.print(" " + arr);
        }
        System.out.println("\nAll Ele of Array multiply : " + res);
    }

    void multiply(double a, int b) {
        double res = a * b;
        System.out.println("double " + a + " int " + b + " multiply : " + res);
    }

}

public class Ques36 {
    public static void main(String[] args) {
        MathOperation36 m1 = new MathOperation36();
        int arr[] = new int[] { 5, 10, 20 };
        m1.multiply(10, 5);
        m1.multiply(5.0f, 2.5f, 7.5f);
        m1.multiply(arr);
        m1.multiply(10.0d, 5);
    }
}
