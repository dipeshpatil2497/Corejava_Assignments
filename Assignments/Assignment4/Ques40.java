import java.util.*;

class Student40 {
    public int rollno;
    public String name;
    public int age;
    public int score;

    void setval(int rollno, String name, int age, int score) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    void show() {
        System.out.println("Rollno : " + rollno + " name : " + name + " age : " + age + " Score :" + score);
    }
}

class Ques40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student40 s[] = new Student40[5];

        for (int i = 0; i < s.length; i++) {
            System.out.println("Enter rollno , name ,age and score of " + (i + 1) + "th Student :");
            int rollno = sc.nextInt();
            String name = sc.next();
            int age = sc.nextInt();
            int score = sc.nextInt();
            Student40 std = new Student40();
            std.setval(rollno, name, age, score);
            s[i] = std;
        }
        // int count1 = 0;
        // int count2 = 0;
        // int count3 = 0;
        // int count4 = 0;
        System.out.println("****Group 1****");
        for (Student40 arr : s) {
            if (arr.score > 0 && arr.score <= 50) {
                arr.show();
            } else {
                // count1++;
            }
        }
        // if (count1 == 0) {
        // System.out.println("No Student comes under this Group");
        // }
        System.out.println("****Group 2****");
        for (Student40 arr : s) {
            if (arr.score > 50 && arr.score <= 65) {
                arr.show();
            } else {
                // count2++;
            }
        }
        System.out.println("****Group 3****");
        for (Student40 arr : s) {
            if (arr.score > 65 && arr.score <= 80) {
                arr.show();
            } else {
                // count3++;
            }
        }
        System.out.println("****Group 4****");
        for (Student40 arr : s) {
            if (arr.score > 80 && arr.score <= 100) {
                arr.show();
            } else {
                // count4++;
            }
        }
        sc.close();
    }
}