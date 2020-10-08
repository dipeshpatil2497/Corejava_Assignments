import java.util.*;

class Student {
    private int rollno;
    private String name;

    void setval(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void show() {
        System.out.println("Rollno = " + rollno + " Name : " + name);
    }

}

class Ques33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rollno and name :");
        int rollno = sc.nextInt();
        String name = sc.next();
        Student s1 = new Student();
        s1.setval(rollno, name);
        s1.show();
        sc.close();
    }
}