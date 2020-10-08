class Faulty {
    private int facultyid;
    private double salary;

    void input(int facultyid, double salary) {
        this.facultyid = facultyid;
        this.salary = salary;
    }

    void show() {
        System.out.println("FaultyID : " + facultyid + " And Salary : " + salary);
    }
}

class FullTimeFaculty extends Faulty {
    private double basicSalary;
    private double allowance;

    void input(int facultyid, double basicSalary, double allowance) {
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        double salary = basicSalary + allowance;
        super.input(facultyid, salary);
    }

    void show() {
        System.out.println("BasicSalary : " + basicSalary + " And Allowance : " + allowance);
        super.show();
    }

}

class PartTimeFaculty extends Faulty {
    private int workingHour;
    private int ratePerHour;

    void input(int facultyid, int workingHour, int ratePerHour) {
        this.workingHour = workingHour;
        this.ratePerHour = ratePerHour;
        double salary = workingHour * ratePerHour;
        super.input(facultyid, salary);
    }

    void show() {
        System.out.println("WorkingHour : " + workingHour + " And RateperHour : " + ratePerHour);
        super.show();
    }

}

class Ques44 {
    public static void main(String[] args) {
        System.out.println("Calling with FullTimeFaculty : ");
        FullTimeFaculty ftf = new FullTimeFaculty();
        ftf.input(101, 55000, 20000);
        ftf.show();
        System.out.println("");
        System.out.println("Calling with PartTimeFaculty : ");
        PartTimeFaculty ptf = new PartTimeFaculty();
        ptf.input(201, 12, 5000);
        ptf.show();
    }
}
