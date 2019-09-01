package Member;

public abstract  class Person {
    private String name;
    private char sex;
    private int age;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public String getName() {
        return this.name;
    };
    public int getAge(){
        return this.age;
    };
    public char getSex(){
        return this.sex;
    };

}
