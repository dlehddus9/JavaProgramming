package Problem5;

public class Test_05 {
    public static void main(String[] args) {
        MyPoint p = new MyColorPoint(2,3,"blue");
        p.move(3,4);
        p.reverse();
        p.show();
    }
}
