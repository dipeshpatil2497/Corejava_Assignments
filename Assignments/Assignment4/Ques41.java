class Emp41 {
    Emp41() {
        this(10);
        System.out.println("0 para constr");
    }

    Emp41(int empno) {
        System.out.println("para constr");
    }

    void show() {
        System.out.println("Emp41 class");

    }
}

class Ques41 {
    public static void main(String[] args) {
        Emp41 e = new Emp41();
        e.show();
    }
}
