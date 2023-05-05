package Ex9_6;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void writeOutput() {
        System.out.println("Name: " + name);
    }
}
