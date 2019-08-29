package Person;

public class person {
    private String name;
    private char sex;
    private int age;

    public person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
}
