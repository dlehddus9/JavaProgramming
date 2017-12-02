package Prac;

public class Main {
    public static void main(String[] args) {
        Calc c = new Calc();
        String postfixExp= c.postfix("3.0+2.0*1.5-(3.5+1.5)-2.0");
        Double result = c.result(postfixExp);
        System.out.println("변한 값은" +postfixExp);
        System.out.println("계산 결과는" +result);
    }
}
