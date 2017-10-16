package problem5;

public class Div {
    private int a;
    private int b;
    void setValue(int a , int b)
    {
        this.a=a;
        this.b=b;
    }
    int calculate() {
        return a/b; // 문제에서 int 로만 주었기때문에 정확한 값으로 나눌필요없다.
    }
}
