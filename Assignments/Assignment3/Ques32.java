class Q32Student {
    private int rollno;
    private String name;
    private static int count = 0;

    Q32Student() {
        count++;
    }

    void set(int a, String b) {
        rollno = a;
        name = b;
    }

    void show() {
        System.out.println("Rollno : " + rollno + "  Name : " + name + " Count : " + count);
    }

}

class Ques32 {
    public static void main(String[] args) {
        Q32Student s1 = new Q32Student();
        s1.set(36, "Dipesh");
        s1.show();
        s1.set(134, "Vipul");
        s1.show();
        Q32Student s2 = new Q32Student();
        s2.set(39, "Harshada");
        s2.show();

    }
}
