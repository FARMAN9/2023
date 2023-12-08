public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name) {
        this(name, 0); // Calls the second constructor
        this.address = "";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "";
    }

    // Other methods...

}