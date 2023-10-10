package overload;

public class MethodTest2 {
    public static void main(String[] args) {
        fire();
        fire("american");
        fire(10, "india");
    }
    public static void fire(int num, String country) {
        System.out.println("发射" + num + "枚导弹给" + country);
    }
    public static void fire(String country) {
        fire(1, country);
    }

    public static void fire() {
        fire("岛国");
    }
}
