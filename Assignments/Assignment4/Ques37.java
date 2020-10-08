class Person {
    private String name;
    private int age;

    Person() {
        age = 18;
        System.out.println("Paraless constr");
    }

    Person(String name) {
        this();
        // this.age = age;
        this.name = name;
        System.out.println("Para constr");
    }

    void show() {
        System.out.println("Person Name : " + name + " and Age is : " + age);
    }
}

class Ques37 {
    public static void main(String[] args) {
        Person p = new Person("Dipesh");
        p.show();
    }
}
