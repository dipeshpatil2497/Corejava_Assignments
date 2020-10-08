class Employee {
    private static int empno;
    private double salary;
    private static double totalSalary;

    Employee(double salary) {
        this.salary = salary;
        empno++;
        totalSalary();
    }

    void totalSalary() {
        totalSalary = totalSalary + salary;
    }

    void empInfo() {
        System.out.print("Total Emp : ");
        for (int a = 1; a <= empno; a++) {
            System.out.print(" " + a);
        }
        System.out.println("\nTotal salary : " + totalSalary);
    }

}

class Ques38 {
    public static void main(String[] args) {
        Employee e = new Employee(20000);
        Employee e1 = new Employee(50000);
        Employee e2 = new Employee(70000);
        e.empInfo();
        e1.empInfo();
        e2.empInfo();
    }
}
