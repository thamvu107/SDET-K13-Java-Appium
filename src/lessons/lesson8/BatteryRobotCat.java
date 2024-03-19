package src.lessons.lesson8;

// Reuse concept
// Child class | subclass
// Inheritance : IS-A relationship -> Controller
// Not allow extends multi parent classes
// Overloading
// Overriding
public class BatteryRobotCat extends RobotCat {
    public BatteryRobotCat() {
        super("name", "abc");
    }

    @Override
    public String charge() {
        String prefix = super.charge(); // supper -> truy cap tam vuc cha - this truy can tam vuc hien tai
        return prefix.concat(" with battery");
    }
}
