package src.lessons.lesson9.p01.dataValidation;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        validateAgeValue(age);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        validateAgeValue(age);
        this.age = age;
    }

    private void validateAgeValue(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must not be negative" + age);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
