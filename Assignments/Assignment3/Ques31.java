import java.util.*;

class Student {
    private int rollno;
    private String name;

    void setData(int a, String b) {
        rollno = a;
        name = b;
    }

    void showData() {
        System.out.println("Student Rollno :" + rollno + " and Name : " + name);
    }

}

class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Enter Rollno and Firstname of Student :");
        int rno = sc.nextInt();
        String nm = sc.next();
        s1.setData(rno, nm);
        s1.showData();
        sc.close();
    }
}