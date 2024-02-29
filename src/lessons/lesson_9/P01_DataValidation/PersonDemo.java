package src.lessons.lesson_9.P01_DataValidation;

public class PersonDemo {
    public static void main(String[] args) {
        Person ti = new Person("Ti", 1);
        ti.setAge(-1);
        System.out.println(ti);

        // Control data/property value manipulation
    }
}
