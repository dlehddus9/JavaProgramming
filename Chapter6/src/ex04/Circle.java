package ex04;

public class Circle {
    private int x;
    private int y;
    private int radius;
    public Circle(int x, int y ,int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    boolean equals(Circle p) {
        if(this.radius==p.radius){
            return true;
        }
        else {
            return false;
        }
    }
}
