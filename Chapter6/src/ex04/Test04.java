package ex04;

public class Test04 {
    public static void main(String[] args) {
        Circle a1= new Circle(2,3,4);
        Circle a2= new Circle(3,4,4);

        if(a1.equals(a2)) {
            System.out.println("같은 원입니다.");
        }
    }
}
