package Problem2;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws IOException{
        int a,b;
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("두 정수와 연산자를 입력하시오");
        a=sc.nextInt();
        b=sc.nextInt();
        c=(char)System.in.read();
        System.out.println(c);
        Add add = new Add();
        Sub sub = new Sub();
        Div div = new Div();
        Mul mul = new Mul();

        switch (c)
        {
            case '+' :
                add.setValue(a,b);
                System.out.println(add.calculate());
                break;
            case '-':
                sub.setValue(a,b);
                System.out.println(sub.calculate());
                break;
            case '*':
                mul.setValue(a,b);
                System.out.println(mul.calculate());

                break;
            case '/':
                div.setValue(a,b);
                System.out.println(div.calculate());
                break;
        }

    }
}
