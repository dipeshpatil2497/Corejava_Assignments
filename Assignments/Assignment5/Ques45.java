import java.util.*;

class Student45 {
    public int rollno;
    public double percentage;

    Student45() {
        this.rollno = 0;
        this.percentage = 0.0;
    }

    Student45(int rollno, double percentage) {
        this.rollno = rollno;
        this.percentage = percentage;
    }

    void show() {
        System.out.print("Rollno : " + rollno + ", Percentage : " + percentage);
    }
}

class CollageStudent45 extends Student45 {
    public int semester;

    CollageStudent45() {
        // System.out.println("CollageStudent constr");
        this.semester = 0;
    }

    CollageStudent45(int rollno, double percentage, int semester) {
        super(rollno, percentage);
        this.semester = semester;
    }

    void show() {
        // System.out.print(" CollageStudent");
        super.show();
        System.out.print(" And Semester : " + semester);
    }
}

class SchoolStudent45 extends Student45 {
    public String className;

    SchoolStudent45() {
        this.className = null;
        // System.out.println("SchoolStudent constr");
    }

    SchoolStudent45(int rollno, double percentage, String className) {
        super(rollno, percentage);
        this.className = className;
    }

    void show() {
        // System.out.print(" SchoolStudent");
        super.show();
        System.out.print(" And ClassName : " + className);
    }
}

class Ques45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student45 sarr[] = new Student45[5];

        for (int i = 0; i < sarr.length; i++) {
            if (i <= 1) {
                System.out.println("Enter " + (i + 1) + "th CollageStudent Details : ");
                System.out.println("Enter rollno : ");
                int rollno = sc.nextInt();
                System.out.println("Enter percentage : ");
                double percentage = sc.nextDouble();
                System.out.println("Enter semester : ");
                int semester = sc.nextInt();
                CollageStudent45 cs = new CollageStudent45(rollno, percentage, semester);
                sarr[i] = cs;
            } else {
                System.out.println("Enter " + (i - 1) + "th SchoolStudent Details : ");
                System.out.println("Enter rollno : ");
                int rollno = sc.nextInt();
                System.out.println("Enter percentage : ");
                double percentage = sc.nextDouble();
                System.out.println("Enter classname : ");
                String className = sc.next();
                SchoolStudent45 cs = new SchoolStudent45(rollno, percentage, className);
                sarr[i] = cs;
            }
        }
        int z = 1;
        int gradecount = 0;
        for (Student45 a : sarr) {
            if (z <= 1) {
                System.out.println("Collage Student : ");
            } else if (z == 3) {
                System.out.println("School Student : ");
            }
            a.show();
            if (a.percentage > 75) {
                gradecount++;
            }
            System.out.println("");
            z++;
        }
        System.out.println("A Grade Students : " + gradecount);

        int notfound = 0;
        System.out.println("Enter Rollno : ");
        int rollno = sc.nextInt();
        for (int i = 0; i < sarr.length; i++) {
            if (sarr[i] instanceof CollageStudent45) {
                CollageStudent45 cs45 = (CollageStudent45) sarr[i];
                if (cs45.rollno == rollno) {
                    System.out.println(rollno + " is a Collage Student");
                    notfound++;
                    break;
                }
            } else if (sarr[i] instanceof SchoolStudent45) {
                SchoolStudent45 cs45 = (SchoolStudent45) sarr[i];
                if (cs45.rollno == rollno) {
                    System.out.println(rollno + " is a School Student");
                    notfound++;
                    break;
                }
            }
        }
        if (notfound == 0) {
            System.out.println(rollno + " is Neither a School nor a Collage Student");
        }
        sc.close();
    }
}
