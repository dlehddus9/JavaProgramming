package Problem2;

public class Div extends Calc {
    @Override
    void setValue(int a, int b) {
        super.a=a;
        super.b=b;
    }

    @Override
    int calculate() {
        return a/b;
    }
}
