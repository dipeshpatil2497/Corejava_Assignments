class MathOperation {
    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int power(int a, int b) {
        int p = (int) Math.pow(a, b);
        return p;
    }
}

class Ques35 {
    public static void main(String[] args) {
        int a = MathOperation.add(10, 20);
        int b = MathOperation.sub(100, 20);
        int c = MathOperation.multiply(10, 5);
        int d = MathOperation.power(2, 5);
        System.out.println("Add : " + a + "\nSub : " + b + "\nMultiply : " + c + "\nPower : " + d);
    }
}
