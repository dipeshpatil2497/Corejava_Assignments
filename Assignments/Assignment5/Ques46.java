class Person46 {
    void getDetail() {
        System.out.println("person details");
    }

    void getJob() {
        System.out.println("person job");
    }
}

class Employee46 extends Person46 {
    void getJob() {
        System.out.println("employee job");
    }

    void getDept() {
        System.out.println("employee dept");
    }
}

class Ques46 {
    public static void main(String args[]) {
        Person46 ar[] = { new Employee46(), new Person46() };
        for (Person46 a : ar) {
            if (a instanceof Employee46) {
                Employee46 e = (Employee46) a;
                e.getDept();
            }
        }
    }
}
