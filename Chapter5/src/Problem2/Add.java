package Problem2;

public class Add extends Calc {
    @Override
    void setValue(int a, int b) {
        this.a=a;
        this.b=b;
    }

    @Override
    int calculate() {
        return this.a+this.b;
    }
}
