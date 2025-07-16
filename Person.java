package college.students;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Name: Default constructor");
        this.name = "Default";
        this.age = 0;
    }

    public Person(String name, int age) {
        System.out.println("Name : Parameterized Constructor");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void introduce() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}