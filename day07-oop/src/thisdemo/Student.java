package thisdemo;

public class Student {
    double score;

    public void printThis() {
        System.out.println(this);
    }

    public void printPass(double score) {
        if (this.score > score) {
            System.out.println("恭喜你进入哈尔滨佛学院");
        } else {
            System.out.println("落选了");
        }
    }
}
