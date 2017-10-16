/*
5.
        다수의 클래스를 정의하고 활용하는 연습을 해보자.더하기(+),빼기(-), 곱하기(*)
        나누기(/) 를 수행하는 각 클래스 Add, Sub,Mul,Div를 만들어라. 이들은 모두 다음
        필드와 메소드를 가진다.
        int 타입의 a,b필드: 연산하고자 하는 피연산자
        void setValue(int a , int b) : 피연사자를 객체 내에 설정한다.
        int calculate() : 해당클래스의 목적에 맞는 연산을 실행하고 그 결과를 리턴한다.

        Add :int a ,int b, setValue(). calculate()
        Sub : int a , int b , setValue(), calculate()
        Mul : int a , int b , setValue(), calculate()
        Div : int a , int b , setValue(), calculate()
        main() 메소드에서는 다음 실행 사례의 그림과 같이 키보드로부터 두 정수와 계산하고자 하는
        연사자를 입력받은 후 Add,Sub,Mul,Div 중에서 이 연산을 실행할 수 있는 객체를
        생성하고 setValue() 와 calculate()를 호출하여 그 결과 값을 화면에 출력한다.

        메인 실행 -->  두정수와 연산자를 입력하시오 3 4 +
        결과 --> 7
*/


        package problem5;

import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        int a,b;
        String c;
        Scanner sc=new Scanner(System.in);
        System.out.println("두 정수와 연산자를 입력하시오");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.next();

        if(c.equals("+"))
        {
            Add add=new Add();
            add.setValue(a,b);
            System.out.println(add.calculate());
        }
        else if(c.equals("-"))
        {
            Sub sub=new Sub();
            sub.setValue(a,b);
            System.out.println(sub.calculate());
        }
        else if(c.equals("*"))
        {
            Mul mul=new Mul();
            mul.setValue(a,b);
            System.out.println(mul.calculate());
        }
        else if(c.equals("/"))
        {
            Div div= new Div();
            div.setValue(a,b);
            System.out.println(div.calculate());
        }
        else {
            System.out.println("잘못입력하셨습니다.");
        }


    }

}
