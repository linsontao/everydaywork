package Member;
// 抽象类继承
public class Student extends Person {
    private float score;

    public Student(String name, char sex, int age, float score) {
        super(name, sex, age);
        score = this.score;
    }

    public float getScore() {
        return this.score;
    }
// 方法重载，需要参数不一样
    public String getName(float score) {
        return getName() + "the score is " + String.valueOf(score);
    }

}
