package Problem4;

public class CPoint {
    String color;
    int a,b;
    public CPoint(int a , int b) {
        this.a=a;
        this.b=b;
        color="";
    }
    public void show() {

        System.out.println( " ("+a+ ","+b+")" +color);
    }
    public String toString() {
        return "("+a+","+b+")"+"입니다."+"";

    }
}
