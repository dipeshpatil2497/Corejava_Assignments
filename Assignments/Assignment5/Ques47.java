class Employee47 {
    private int empId;
    private String name;

    Employee47(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    void show() {
        System.out.print("EmpID : " + empId + ", Name : " + name);
    }
}

class Manager extends Employee47 {
    private String dept;

    Manager(int empID, String name, String dept) {
        super(empID, name); // Contr chaining; Calling superclass constr from subclass
        this.dept = dept;
    }

    void show() {
        super.show();
        System.out.print(" And Dept : " + dept);
    }
}

class Ques47 {
    public static void main(String[] args) {
        Manager m = new Manager(101, "Dipesh", "R&D");
        m.show();
    }
}
